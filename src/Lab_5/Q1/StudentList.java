/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author maianhtran
 */
public class StudentList {

    Vector<Student> studentList = new Vector<>();

    public StudentList() {
        loadUniversity();
    }

    public void AddCollegeStudent() {
        Student student = new CollegeStudent();
        student.input();
        studentList.add(student);
        saveUniversity();
    }

    public void AddUniversityStudent() {
        Student student = new UniversityStudent();
        student.input();
        studentList.add(student);
        saveUniversity();
    }

    public void RemoveStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's code: ");
        String code = sc.next();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentNumber().equalsIgnoreCase(code)) {
                studentList.remove(i);
            }
        }
        saveUniversity();
    }

    public void PrintStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).output();
            System.out.println();
        }
    }

    public void StudentGraduation() {
        int count = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).graduation()) {
                studentList.get(i).output();
                System.out.println();
                count++;
            }
        }
        System.out.println("The number of eligible students: " + count);
    }

    public void sort() {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                if (s1 instanceof CollegeStudent && s2 instanceof UniversityStudent) {
                    return -1;
                } else if (s1 instanceof UniversityStudent && s2 instanceof CollegeStudent) {
                    return 1;
                } else {
                    return s1.getStudentNumber().compareTo(s2.getStudentNumber());
                }
            }
        };
        studentList.sort(com);
        PrintStudentList();
        saveUniversity();

    }

    public void findStudentName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String n = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getFullName().contains(n)) {
                studentList.get(i).output();
                System.out.println();
            }
        }
    }
    String fileName = "University6.Dat";
    public void saveUniversity() {
        try {
            FileOutputStream f = new FileOutputStream(fileName);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeObject(studentList);
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error save file"+ e.getMessage());
        }
    }

    public void loadUniversity() {
        try {
            FileInputStream f = new FileInputStream(fileName);
            ObjectInputStream inStream = new ObjectInputStream(f);
            studentList = (Vector<Student>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error load file");
        }

    }
}
