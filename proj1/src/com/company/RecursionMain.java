package com.company;

import java.io.File;

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
        return 1 + recursive_add(x, y  - 1);
    }

    static int recursive_minus(int x, int y) {
        if (y == 0) {
            return x;
        }
        return recursive_minus(x, y  - 1) - 1;
    }

    static int recursive_factorial(int x) {
        // 0! = 1
        // 1! = 1
        // 2! = 1*2 = 2
        // 3! = 1*2*3 = 6 ...
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * recursive_factorial(x - 1);

        // 5* (4*3*2*1)
        //    4* (3*2*1)
        //       3* (2*1)
        //          2*(1)

        // 5!
        // 5 * 4!             == 5*24 = 120 (5!)
        //     4 * 3!         == 4*6  = 24  (4!)
        //         3 * 2!     == 3*2  = 6   (3!)
        //             2 * 1! == 2*1  = 2   (2!)
        //                 1  ==   1  = 1   (1!)
    }

    public static void printDirectoryTree(File folder, int level) {
        // can happen only in the 1st folder
        if (!folder.exists()) {
            System.out.println("Folder does not exist.");
            return;
        }

        // Print indentation based on the level of recursion
        printIndent(level);
        System.out.println("<" + folder.getName() + ">");

        // Get all files and folders in the current folder
        File[] files = folder.listFiles();

        // protected problematic folder
        if (files == null) {
            return; // This can occur if the directory is not accessible
        }

        // Loop through each file and folder
        for (File file : files) {
            if (file.isDirectory()) {
                // Recursively print the directory
                //  #50 = ".git" file.getName()
                // #100 = ".git" constant
                // file.getName() == ".git" constant ? No
                // 1 == 1
                // a = { x: 1 } b = { x: 1 }
                // a == b ? No
                // "5" == 5 ? True
                // "5" === 5 ? false
                // file_name ".git" === ".git"
                if (!file.getName().equals(".git") && !file.getName().equals("objects"))
                    printDirectoryTree(file, level + 1);
            } else {
                // Print the file name, indented
                printIndent(level + 1);
                System.out.println(file.getName());
            }
        }
    }

    private static void printIndent(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    "); // 4 spaces for each level of indentation
        }
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

        printDirectoryTree(new File("D:\\ecom\\fullstack27_09_23\\java\\05.06.2024"), 0);

        // atzeret factorial
        // 5! = 1*2*3*4*5 120

        // hw:
        //   multiply
        //   divide (without module)
        //   fibonacci
        //     1 1 2 3 5 8 13 21
    }
}
