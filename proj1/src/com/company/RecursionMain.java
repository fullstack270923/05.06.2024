package com.company;

public class RecursionMain {

//    static boolean not_connected = true;
//    private static void hoo() {
//        throw new IllegalArgumentException();
//    }
//
//    private static void goo() {
//        if (not_connected) {
//            hoo();
//        }
//    }

    private static void PrintFilesAndFolders(String path) {
        // print all folders
        // print all files

        // f for-each on all folders:
        //        PrintFilesAndFolders(f)
    }

    private static void foo() {
        //goo();
        //foo();
    }

    static int recursive_add(int x, int y) {
        if (y == 0) {
            return x;
        }
        return recursive_add(x + 1, y  - 1);
    }

    static int recursive_minus(int x, int y) {
        if (y == 0) {
            return x;
        }
        return recursive_minus(x - 1, y  - 1);
    }

    static int recursive_factorial() {
        // if
        // return
    }

    public static void main(String[] args) {
        //PrintFilesAndFolders("c:\\temp");
        //foo();
        int result_add = recursive_add(5, 3);
        int result_min = recursive_minus(5, 3);
        int result_factorial = recursive_factorial(5);
        System.out.println(result_add); // 8
        System.out.println(result_min); // 3
        System.out.println(result_factorial); // 120

        // atzeret factorial
        // 5! = 1*2*3*4*5 120
    }
}
