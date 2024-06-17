/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalexam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncomeTaxCalculator1 extends JFrame {
    private JTextField nameField, ageField, monthlyIncomeField, addressField, phoneNumberField, emailField;
    private JComboBox<Integer> dependentsComboBox;
    private JTextArea resultArea;

    public IncomeTaxCalculator1() {
        setTitle("Income Tax Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Panel for input fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(8, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        inputPanel.add(new JLabel("Monthly Income:"));
        monthlyIncomeField = new JTextField();
        inputPanel.add(monthlyIncomeField);

        inputPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        inputPanel.add(addressField);

        inputPanel.add(new JLabel("Phone Number:"));
        phoneNumberField = new JTextField();
        inputPanel.add(phoneNumberField);

        inputPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        inputPanel.add(emailField);

        inputPanel.add(new JLabel("Number of Dependents:"));
        dependentsComboBox = new JComboBox<>();
        for (int i = 0; i <= 6; i++) {
            dependentsComboBox.addItem(i);
        }
        inputPanel.add(dependentsComboBox);

        mainPanel.add(inputPanel);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        JButton calculateButton = new JButton("Calculate");
        JButton clearButton = new JButton("Clear");
        buttonPanel.add(calculateButton);
        buttonPanel.add(clearButton);
        mainPanel.add(buttonPanel);

        // Result area
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setPreferredSize(new Dimension(200, 100));
        mainPanel.add(scrollPane);

        add(mainPanel);

        // Event handling
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTax();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void calculateTax() {
        // Input validation
        if (nameField.getText().isEmpty() || ageField.getText().isEmpty() || monthlyIncomeField.getText().isEmpty() ||
            addressField.getText().isEmpty() || phoneNumberField.getText().isEmpty() || emailField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields cannot be blank.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!ageField.getText().matches("\\d+") || !monthlyIncomeField.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Age and Monthly Income must be numeric.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        double monthlyIncome = Double.parseDouble(monthlyIncomeField.getText());
        String address = addressField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();
        int dependents = (int) dependentsComboBox.getSelectedItem();

        Employee emp = new Employee(name, age, address, phoneNumber, email, monthlyIncome, dependents);
        double tax = emp.calculateIncomeTax();

        // Format output
        resultArea.setText(String.format("Name: %s\nAge: %d\nMonthly Income: %.0f\nNumber of Dependents: %d\nIncome Tax: %.1f VND",
                                          name, age, monthlyIncome, dependents, tax));
    }

    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
        monthlyIncomeField.setText("");
        addressField.setText("");
        phoneNumberField.setText("");
        emailField.setText("");
        dependentsComboBox.setSelectedIndex(0);
        resultArea.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncomeTaxCalculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncomeTaxCalculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncomeTaxCalculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncomeTaxCalculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeTaxCalculator1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
