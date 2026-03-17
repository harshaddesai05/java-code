package com.exp3;
class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    void calculateSalary(double bonus) {
        System.out.println("Salary with Bonus: " + (salary + bonus));
    }
}
class Manager extends Employee {

    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class employeems {

    public static void main(String[] args) {

        Employee emp = new Employee("Ashish", 15, 45000);
        Manager mgr = new Manager("Harshad", 11, 65000, "IT");

        System.out.println("Employee Details:");
        emp.display();
        emp.calculateSalary();
        emp.calculateSalary(2500);

        System.out.println("\nManager Details:");
        mgr.display();
        mgr.calculateSalary(6000);
    }
}
