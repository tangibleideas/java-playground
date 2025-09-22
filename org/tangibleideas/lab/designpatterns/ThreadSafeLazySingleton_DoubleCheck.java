package org.tangibleideas.lab.designpatterns;

public class ThreadSafeLazySingleton_DoubleCheck {

    private static ThreadSafeLazySingleton_DoubleCheck instance;

    public static ThreadSafeLazySingleton_DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazySingleton_SynchronizedMethod.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazySingleton_DoubleCheck();
                }
            }
        }
        return instance;
    }

    private ThreadSafeLazySingleton_DoubleCheck() {
    }
}
