package org.tangibleideas.lab;

import org.tangibleideas.lab.corejava.AnonymousClassExample;

public class MainClass {

    // --------------- ANONYMOUS CLASSES ---------------
    public static void main(String[] args) {
        AnonymousClassExample.doSomething();
    }


    // ---------- LOCAL CLASSES ----------
//    public static void main(String[] args) {
//        LocalClassExample.outerStaticMethod();
//
//        LocalClassExample example = new LocalClassExample();
//        example.outerInstanceMethod();
//    }

// ---------------------INNER CLASS & STATIC NESTED CLASS-------------
//    public static void main(String[] args) {
//        OuterClass outer = new OuterClass();
//        OuterClass.InnerClass innerClass = outer.new InnerClass();
//        OuterClass.InnerClass.inner_static_int = 1000;
//        OuterClass.InnerClass innerClass2 = outer.new InnerClass();
//
//        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
//        staticNestedClass.doStuff();
//    }


//     ------------------- SINGLETON -- QUICK SANITY CHECK--------------------
//    public static void main(String[] args) {
//        SimpleLazySingleton o1 = SimpleLazySingleton.getInstance();
//        SimpleLazySingleton o2 = SimpleLazySingleton.getInstance();
//        System.out.println(o1 == o2);
//
//        ThreadSafeEagerSingleton o3 = ThreadSafeEagerSingleton.getInstance();
//        ThreadSafeEagerSingleton o4 = ThreadSafeEagerSingleton.getInstance();
//        System.out.println(o3 == o4);
//
//        ThreadSafeLazySingleton_DoubleCheck o5 = ThreadSafeLazySingleton_DoubleCheck.getInstance();
//        ThreadSafeLazySingleton_DoubleCheck o6 = ThreadSafeLazySingleton_DoubleCheck.getInstance();
//        System.out.println(o5 == o6);
//
//        ThreadSafeLazySingleton_StaticInitialization o7 = ThreadSafeLazySingleton_StaticInitialization.getInstance();
//        ThreadSafeLazySingleton_StaticInitialization o8 = ThreadSafeLazySingleton_StaticInitialization.getInstance();
//        System.out.println(o7 == o8);
//
//        ThreadSafeLazySingleton_SynchronizedMethod o9 = ThreadSafeLazySingleton_SynchronizedMethod.getInstance();
//        ThreadSafeLazySingleton_SynchronizedMethod o10 = ThreadSafeLazySingleton_SynchronizedMethod.getInstance();
//        System.out.println(o9 == o10);
//    }


    // ------------ BUILDER ------------------
//    public static void main(String[] args) {
//        // BUILDER - USAGE EXAMPLE
//        Resume myResume1 = new Resume.Builder()
//                .name("My Name")
//                .email("myemail@nodomain.com")
//                .summary("New summary")
//                .addExperience("experience 1")
//                .addExperience("experience 2")
//                .build();
//        System.out.println(myResume1);
//
//        Resume myResume2 = new Resume.Builder()
//                .addExperience("Everything")
//                .build();
//        System.out.println(myResume2);
//    }
}