
package Salary;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(10);
        company.inputEmployees();
        company.printSalarySheet();
        company.printEmployeesBySalary();
        company.highestSalaryEmployee();
    }
}
