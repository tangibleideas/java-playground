package org.tangibleideas.lab.corejava;

public class OuterClass {

    private int outer_int;
    private String outer_string;
    private static int outer_static_int;

    public class InnerClass {
        private int inner_int;
        private String inner_string;
        public static int inner_static_int = 900;
        private static int private_inner_static_int = 900;


        public InnerClass() {
            System.out.printf("outer_int: %s, outer_string: %s\n", outer_int, outer_string);
            System.out.println("inner_static_int: " + inner_static_int);
        }
    }

    public static class StaticNestedClass {
        private int static_nested_int = 800;

        public void doStuff() {
            System.out.println("Private instance variable = " + this.static_nested_int);
            System.out.println("Private static member of other InnerClass = " + InnerClass.private_inner_static_int);
            System.out.println("Private static member of OuterClass = " + outer_static_int);
        }
    }
}
