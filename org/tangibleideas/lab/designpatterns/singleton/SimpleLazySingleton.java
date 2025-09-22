package org.tangibleideas.lab.designpatterns.singleton;

public class SimpleLazySingleton {

    private static SimpleLazySingleton instance;

    public static SimpleLazySingleton getInstance() {
        if (instance == null) {
            instance = new SimpleLazySingleton();
        }
        return instance;
    }

    private SimpleLazySingleton() {
    }
}
