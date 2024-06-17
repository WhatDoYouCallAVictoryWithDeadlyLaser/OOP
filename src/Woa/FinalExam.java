/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalexam;

/**
 *
 * @author Computer
 */
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;
    protected String address;
    protected String phoneNumber;
    protected String email;

    // Constructor
    public Person() {}

    public Person(String name, int age, String address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Input method
    public void input(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = sc.nextLine();
        System.out.print("Enter email: ");
        email = sc.nextLine();
    }
}

class Employee extends Person {
    private double monthlyIncome;
    private int numberOfDependents;

    // Constructor
    public Employee() {}

    public Employee(String name, int age, String address, String phoneNumber, String email, double monthlyIncome, int numberOfDependents) {
        super(name, age, address, phoneNumber, email);
        this.monthlyIncome = monthlyIncome;
        this.numberOfDependents = numberOfDependents;
    }

    // Getters and Setters
    public double getMonthlyIncome() { return monthlyIncome; }
    public void setMonthlyIncome(double monthlyIncome) { this.monthlyIncome = monthlyIncome; }
    public int getNumberOfDependents() { return numberOfDependents; }
    public void setNumberOfDependents(int numberOfDependents) { this.numberOfDependents = numberOfDependents; }

    // Input method
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.print("Enter monthly income: ");
        monthlyIncome = scanner.nextDouble();
        System.out.print("Enter number of dependents: ");
        numberOfDependents = scanner.nextInt();
        scanner.nextLine(); // consume newline
    }

    // Calculate Income Tax
    public double calculateIncomeTax() {
        double taxableIncome = monthlyIncome - (numberOfDependents * 4400000);
        double tax = 0;

        if (taxableIncome <= 5000000) {
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= 10000000) {
            tax = 5000000 * 0.05 + (taxableIncome - 5000000) * 0.10;
        } else if (taxableIncome <= 18000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + (taxableIncome - 10000000) * 0.15;
        } else if (taxableIncome <= 32000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + (taxableIncome - 18000000) * 0.20;
        } else if (taxableIncome <= 52000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + (taxableIncome - 32000000) * 0.25;
        } else if (taxableIncome <= 80000000) {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + 20000000 * 0.25 + (taxableIncome - 52000000) * 0.30;
        } else {
            tax = 5000000 * 0.05 + 5000000 * 0.10 + 8000000 * 0.15 + 14000000 * 0.20 + 20000000 * 0.25 + 28000000 * 0.30 + (taxableIncome - 80000000) * 0.35;
        }

        return tax;
    }
}

public class FinalExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            Employee emp = new Employee();
            emp.input(sc);
            employees.add(emp);
        }

        double totalIncomeTax = 0;
        for (Employee emp : employees) {
            totalIncomeTax += emp.calculateIncomeTax();
        }

        System.out.println("Total Income Tax for all employees: " + totalIncomeTax);
    }
}

