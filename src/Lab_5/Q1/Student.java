/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public abstract class Student implements Serializable {

    private String studentNumber;
    private String fullName;
    private int credits;
    private double avgScore;

    public Student() {

    }

    public Student(String studentNumber, String fullName, int credits, double avgScore) {
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.credits = credits;
        this.avgScore = avgScore;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double score) {
        this.avgScore = avgScore;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student number: ");
        studentNumber = sc.nextLine();
        System.out.print("Student's full name: ");
        fullName = sc.nextLine();
        System.out.print("Total number of credits earned: ");
        credits = sc.nextInt();
        System.out.print("Average score: ");
        avgScore = sc.nextDouble();
    }

    public void output() {
        System.out.print(" - Student number: " + studentNumber
                + " - Student's full name: " + fullName
                + " - Total number of credits earned: " + credits
                + " - Average score: " + avgScore );
    }

    public abstract boolean graduation();

}
