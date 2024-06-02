/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class Polymorphism {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudentList list = new StudentList();
        int menu;

        do {
            System.out.printf("1. Add a new college student\n"
                    + "2. Add a new university student\n"
                    + "3. Remove a student from the list with the student code entered from the keyboard\n"
                    + "4. Print student list\n"
                    + "5. Print the list of students eligible for graduation and indicate the number of eligible students\n"
                    + "6. Sort the student list ascending by Student type (College, university) and student code\n"
                    + "7. Find student list by student's full name(Contains)\n"
                    + "8. Exit\nInput: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    list.AddCollegeStudent();
                    break;
                case 2:
                    list.AddUniversityStudent();
                    break;
                case 3:
                    list.RemoveStudent();
                    break;
                case 4:
                    list.PrintStudentList();
                    break;
                case 5:
                    list.StudentGraduation();
                    break;
                case 6:
                    list.sort();
                    break;
                case 7:
                    list.findStudentName();
                    break;
                case 8:
                    break;
            }
        } while (menu != 8);

    }
}
