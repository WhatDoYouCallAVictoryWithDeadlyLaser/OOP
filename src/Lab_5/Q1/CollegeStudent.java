/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author maianhtran
 */
public class CollegeStudent extends Student {

    private double graduationExamScores;
    
    public CollegeStudent(){
        
    }

    public CollegeStudent(double graduationExamScores, String studentNumber, String fullName, int credits, double avgScore) {
        super(studentNumber, fullName, credits, avgScore);
        this.graduationExamScores = graduationExamScores;
    }

    public double getGraduationExamScores() {
        return graduationExamScores;
    }

    public void setGraduationExamScores(double graduationExamScores) {
        this.graduationExamScores = graduationExamScores;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Graduation exam scores: ");
        graduationExamScores = sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print(" - Graduation exam scores: " + graduationExamScores);
    }

    @Override
    public boolean graduation() {
        super.getCredits();
        super.getAvgScore();
        if (getCredits() >= 100 && getAvgScore() >= 5 && graduationExamScores >= 5) {
            return true;
        }
        return false;
    }
}
