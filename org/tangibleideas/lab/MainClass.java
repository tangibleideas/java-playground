package org.tangibleideas.lab;

import org.tangibleideas.lab.designpatterns.builder.Resume;
import org.tangibleideas.lab.designpatterns.singleton.*;

public class MainClass {
    public static void main(String[] args) {

        // BUILDER - USAGE EXAMPLE
        Resume myResume1 = new Resume.Builder()
                .name("My Name")
                .email("myemail@nodomain.com")
                .summary("New summary")
                .addExperience("experience 1")
                .addExperience("experience 2")
                .build();
        System.out.println(myResume1);

        Resume myResume2 = new Resume.Builder()
                .addExperience("Everything")
                .build();
        System.out.println(myResume2);


        // SINGLETON -- QUICK SANITY CHECK
        SimpleLazySingleton o1 = SimpleLazySingleton.getInstance();
        SimpleLazySingleton o2 = SimpleLazySingleton.getInstance();
        System.out.println(o1 == o2);

        ThreadSafeEagerSingleton o3 = ThreadSafeEagerSingleton.getInstance();
        ThreadSafeEagerSingleton o4 = ThreadSafeEagerSingleton.getInstance();
        System.out.println(o3 == o4);

        ThreadSafeLazySingleton_DoubleCheck o5 = ThreadSafeLazySingleton_DoubleCheck.getInstance();
        ThreadSafeLazySingleton_DoubleCheck o6 = ThreadSafeLazySingleton_DoubleCheck.getInstance();
        System.out.println(o5 == o6);

        ThreadSafeLazySingleton_StaticInitialization o7 = ThreadSafeLazySingleton_StaticInitialization.getInstance();
        ThreadSafeLazySingleton_StaticInitialization o8 = ThreadSafeLazySingleton_StaticInitialization.getInstance();
        System.out.println(o7 == o8);

        ThreadSafeLazySingleton_SynchronizedMethod o9 = ThreadSafeLazySingleton_SynchronizedMethod.getInstance();
        ThreadSafeLazySingleton_SynchronizedMethod o10 = ThreadSafeLazySingleton_SynchronizedMethod.getInstance();
        System.out.println(o9 == o10);
    }
}