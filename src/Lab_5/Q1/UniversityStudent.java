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
public class UniversityStudent extends Student {

    private String thesisName;
    private double thesisScore;
    
    public UniversityStudent(){
        
    }

    public UniversityStudent(String thesisName, double thesisScore, String studentNumber, String fullName, int credits, double avgScore) {
        super(studentNumber, fullName, credits, avgScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Thesis name: ");
        thesisName = sc.nextLine();
        System.out.print("Thesis score: ");
        thesisScore = sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print(" - Thesis name: " + thesisName + " - Thesis score: " + thesisScore);
    }

    @Override
    public boolean graduation() {
        super.getCredits();
        super.getAvgScore();
        if (getCredits() >= 150 && getAvgScore() >= 5 && thesisScore >= 5) {
            return true;
        }
        return false;
    }
    
    

}
