package org.tangibleideas.lab.designpatterns;

public class ThreadSafeLazySingleton_SynchronizedMethod {

    private static ThreadSafeLazySingleton_SynchronizedMethod instance = null;

    public static synchronized ThreadSafeLazySingleton_SynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazySingleton_SynchronizedMethod();
        }
        return instance;
    }

    private ThreadSafeLazySingleton_SynchronizedMethod() {
    }
}
