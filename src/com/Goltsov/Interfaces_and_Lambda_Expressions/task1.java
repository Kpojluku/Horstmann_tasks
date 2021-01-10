package com.Goltsov.Interfaces_and_Lambda_Expressions;

/*
Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
Make Employee implement Measurable.
Provide a method double average(Measurable[] objects) that computes the average
measure. Use it to compute the average salary of an array of employees
 */
public class task1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1000, "employee1");
        Employee employee2 = new Employee(1500, "employee2");
        Employee employee3 = new Employee(2000, "employee3");
        System.out.println(average(new Measurable[]{employee1, employee2, employee3}));
    }
    public static double average(Measurable[] objects) {
        double result = 0;
        for (Measurable o : objects) {
            result += o.getMeasure();
        }
        return result / objects.length;
    }
}

interface Measurable {
    double getMeasure();
}

class Employee implements Measurable {
    private double salary;
    private String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Employee() {
    }

    @Override
    public double getMeasure() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
