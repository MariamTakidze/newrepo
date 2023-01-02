package com.solvd.threading.threadcreation;

public class ThreadCreationMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThreadExtendsThread());
        Thread thread2 = new Thread(new MyThreadImplementsRunnable());
        thread.start();
        thread2.start();
    }
}
