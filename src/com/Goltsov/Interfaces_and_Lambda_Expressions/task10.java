package com.Goltsov.Interfaces_and_Lambda_Expressions;
/*
 Implement methods
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)
The first method should run each task in a separate thread and then return.
The second method should run all methods in the current thread
and return when the last one has completed.
 */
public class task10 {
    public static void main(String[] args) {
        runTogether(new A(), new B());
        runInOrder(new A(), new B());
    }
    public static void runTogether(Runnable... tasks){
        for(Runnable t: tasks){
            new Thread(t).start();
        }
    }
    public static void runInOrder(Runnable... tasks){
        for(Runnable t: tasks){
            t.run();
        }
    }
}

class A implements Runnable{

    @Override
    public void run() {
        System.out.println("A");
    }
}
class B implements Runnable{

    @Override
    public void run() {
        System.out.println("B");
    }
}