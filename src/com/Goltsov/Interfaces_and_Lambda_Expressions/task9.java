package com.Goltsov.Interfaces_and_Lambda_Expressions;
/*
Implement a class Greeter that implements Runnable and whose run method
prints n copies of "Hello, " + target, where n and target are set in the constructor.
Construct two instances with different messages and execute
them concurrently in two threads
 */
public class task9 {
    public static void main(String[] args) {
        Greeter greeter1 = new Greeter("world", 3);
        Greeter greeter2 = new Greeter("sun", 4);
        Thread thread1 = new Thread(greeter1);
        thread1.start();
        Thread thread2 = new Thread(greeter2);
        thread2.start();
    }
}
class Greeter implements Runnable{
    String target;
    int n;

    public Greeter(String target, int n) {
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {
        for(int i = 0; i<n; i++)
        System.out.println("Hello, " + target);
    }
}
