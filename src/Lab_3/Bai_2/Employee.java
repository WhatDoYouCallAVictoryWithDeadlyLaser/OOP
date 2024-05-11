import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private double payment;

    public Employee() {
    }

    public Employee(int id, String name, int age, double payment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Payment: $" + payment;
    }
}

