package com.Goltsov.Interfaces_and_Lambda_Expressions;
/*
Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with
the largest salary. Why do you need a cast?
 */
public class task2 {
    public static void main(String[] args) {
        Measurable employee1 = new Employee(1000, "employee1");
        Measurable employee2 = new Employee(1500, "employee2");
        Measurable employee3 = new Employee(2000, "employee3");
        System.out.println(largest(new Measurable[]{employee3, employee2, employee1}));

    }
    public static Measurable largest(Measurable[] objects) {
        double max = objects[0].getMeasure();
        Measurable result = objects[0];
        Measurable o;
        for (int i = 1; i < objects.length; i++) {
            o = objects[i];
            if(o.getMeasure() > max){
                max = o.getMeasure();
                result = o;
            }
        }
        return result;
    }
}
