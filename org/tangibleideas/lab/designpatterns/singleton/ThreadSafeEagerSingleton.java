package org.tangibleideas.lab.designpatterns.singleton;

public class ThreadSafeEagerSingleton {

    private static final ThreadSafeEagerSingleton instance = new ThreadSafeEagerSingleton();

    public static ThreadSafeEagerSingleton getInstance() {
        return instance;
    }

    private ThreadSafeEagerSingleton() {
    }
}
