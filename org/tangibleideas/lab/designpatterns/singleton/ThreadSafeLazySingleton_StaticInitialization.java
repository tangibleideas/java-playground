package org.tangibleideas.lab.designpatterns.singleton;

public class ThreadSafeLazySingleton_StaticInitialization {

    private static class SingletonHolder {
        private static ThreadSafeLazySingleton_StaticInitialization INSTANCE
                = new ThreadSafeLazySingleton_StaticInitialization();
    }

    public static ThreadSafeLazySingleton_StaticInitialization getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private ThreadSafeLazySingleton_StaticInitialization() {
    }
}
