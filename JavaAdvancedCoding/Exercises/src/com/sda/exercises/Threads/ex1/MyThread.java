package com.sda.exercises.Threads.ex1;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Is alive " + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName() + " is dead");
    }
}
