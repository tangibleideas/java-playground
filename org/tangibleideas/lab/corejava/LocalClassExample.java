package org.tangibleideas.lab.corejava;

public class LocalClassExample {
    private int outerClassInstanceMember = 999;
    private static int outerClassInt = 1000;

    public void outerInstanceMethod() {
        class LocalClass {
            private int outerClassInstanceMember = 888;

            void myInfo() {
                System.out.println("Enclosing class instance member: " + LocalClassExample.this.outerClassInstanceMember);
                System.out.println("My shadowed class instance member: " + this.outerClassInstanceMember);
            }
        }

        new LocalClass().myInfo();
    }

    public static void outerStaticMethod() {

        interface MethodLocalClass {
            void myInfo();
        }

        class LocalClass implements MethodLocalClass {
            int localClassInt = 10;
            static int localClassStaticInt = 200;

            void printMembers() {
                System.out.println(localClassInt);
                System.out.println(localClassStaticInt);
                System.out.println("Outer Class static Member outerClassInt" + outerClassInt);
            }

            void updateStaticInt() {
                localClassStaticInt = localClassStaticInt + 10;
            }

            @Override
            public void myInfo() {
                printMembers();
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printMembers();
        localClass.updateStaticInt();
        localClass.printMembers();
    }
}
