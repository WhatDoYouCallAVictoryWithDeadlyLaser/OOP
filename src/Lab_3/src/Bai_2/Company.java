package Bai_2;

import java.util.*;

public class Company {
    ArrayList<FullTime> fullTimes = new ArrayList<>();
    ArrayList<PartTime> partTimes = new ArrayList<>();
    ArrayList<Employee> allEmployees = new ArrayList<>();
    Random  random = new Random();
    private static Scanner sc = new Scanner(System.in);
    public Company() {
    }
    public Company(ArrayList<FullTime> fullTimes) {
        this.fullTimes = fullTimes;
    }

    public void generateRandomEmployees() {
        for (int i = 0; i < 3; i++) {
            FullTime fullTime = new FullTime();
            fullTime.setInfoTest(
                    "FT" + i,
                    "Full Time Employee " + i,
                    1980 + random.nextInt(40),
                    "Address " + i,
                    "Phone " + i,
                    2000 + random.nextInt(8000)
            );
            fullTimes.add(fullTime);
            allEmployees.add(fullTime);

            PartTime partTime = new PartTime();
            partTime.setInfoTest(
                    "PT" + i,
                    "Part Time Employee " + i,
                    1980 + random.nextInt(40),
                    "Address " + i,
                    "Phone " + i,
                    random.nextInt(40),
                    50 + random.nextInt(50)
            );
            partTimes.add(partTime);
            allEmployees.add(partTime);
        }
    }

    public void addFullTimeEmployee() {
        System.out.println("How many employees do you want to add?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            FullTime employee = new FullTime();
            employee.setInfo();
            fullTimes.add(employee);
            allEmployees.add(employee);
        }
    }
    public void showAllFullTimeEmployees() {
        for(FullTime employee : fullTimes) {
            System.out.println(employee.getInfo());
            System.out.println();
        }
    }
    public void addPartTimeEmployee() {
        System.out.println("How many employees do you want to add?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            PartTime employee = new PartTime();
            employee.setInfo();
            partTimes.add(employee);
            allEmployees.add(employee);
        }
    }
    public void showAllPartTimeEmployees() {
        for(PartTime employee : partTimes) {
            System.out.println(employee.getInfo());
            System.out.println();
        }
    }
    public void showAllEmployee(){
        for(Employee employee : allEmployees) {
            System.out.println(employee.getInfo());
            System.out.println();
        }
    }
    public void searchID(String ID){
        boolean found = false;
        for(FullTime employee : fullTimes) {
            if (employee.getID().equals(ID)){
                System.out.println();
                System.out.println(employee.getInfo());
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found){
            for(PartTime employee : partTimes) {
                if (employee.getID().equals(ID)){
                    System.out.println();
                    System.out.println(employee.getInfo());
                    System.out.println();
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("ID not found");
        }
    }

    public void deleteID(String ID){
        boolean found = false;
        for(FullTime employee : fullTimes) {
            if (employee.getID().equals(ID)){
                System.out.println("Removed employee: " + employee.getEmployeeName());
                fullTimes.remove(employee);
                found = true;
                break;
            }
        }
        if (!found){
            for(PartTime employee : partTimes) {
                if (employee.getID().equals(ID)){
                    System.out.println("Removed employee: " + employee.getEmployeeName());
                    partTimes.remove(employee);
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("ID not found");
        }
    }
    public void editID(String ID){
        boolean found = false;
        for(FullTime employee : fullTimes) {
            if (employee.getID().equals(ID)){
                employee.editEmployee();
                found = true;
                break;
            }
        }
        if (!found){
            for(PartTime employee : partTimes) {
                if (employee.getID().equals(ID)){
                    employee.editEmployee();
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("ID not found");
        }
    }
    public void searchByPayment(float from, float to){
        for(FullTime employee : fullTimes) {
            if (employee.getPayment() >= from && employee.getPayment() <= to){
                System.out.println();
                System.out.println(employee.getInfo());
                System.out.println();
            }
        }
        for(PartTime employee : partTimes) {
            if (employee.getPayment() >= from && employee.getPayment() <= to){
                System.out.println();
                System.out.println(employee.getInfo());
                System.out.println();
            }
        }
    }

    public void sort(){
        Comparator<Employee> ageThenPaymentComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                // Compare by age first
                int ageCompare = Integer.compare(e1.getYearOfBirth(), e2.getYearOfBirth());
                if (ageCompare != 0) {
                    return ageCompare;
                }
                // If age is equal, compare by payment
                return Float.compare(e1.getPayment(), e2.getPayment());
            }
        };
        allEmployees.sort(ageThenPaymentComparator);
        System.out.println("Sort Operation finished, use Menu to show all Employees");
    }

}