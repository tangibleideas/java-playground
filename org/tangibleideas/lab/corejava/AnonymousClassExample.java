package org.tangibleideas.lab.corejava;

public class AnonymousClassExample {

    public static void doSomething() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        new Thread(r).start();
    }
}
