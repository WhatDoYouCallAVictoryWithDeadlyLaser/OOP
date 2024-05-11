package Salary;

import java.util.Scanner;

public class Employees {
    private String name;
    private String employeeCode;
    private int years_of_service;
    private double salaryCoefficient;
    private double salary;
    private static Scanner sc = new Scanner(System.in);



    private int basicSalary;

    public Employees() {
    }

    public Employees(String name, String employeeCode, int years_of_service, int basicSalary) {
        this.name = name;
        this.employeeCode = employeeCode;
        this.years_of_service = years_of_service;
    }

    public void input(){
        System.out.println("Employee name? ");
        this.name = sc.nextLine();
        System.out.println("Employee code? ");
        this.employeeCode = sc.nextLine();
        System.out.println("Employee years of service? ");
        this.years_of_service = sc.nextInt();
        sc.nextLine();
        this.salaryCoefficient = Math.pow(1.10, years_of_service);
        this.salary = salaryCoefficient * basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public int getYears_of_service() {
        return years_of_service;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setYears_of_service(int years_of_service) {
        this.years_of_service = years_of_service;
    }
    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void printSalary(){
        System.out.println("Employee name: "+name+" | years of service: "+years_of_service+" | Salary: "+salary);
    }
    public double getSalary(){
        return salary;
    }

}