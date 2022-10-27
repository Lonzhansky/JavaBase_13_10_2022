package com.hillel.lonzhnasky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        String next = scanner.next();
//        System.out.println("next: " + next);

//        String nextLine = scanner.nextLine();
//        System.out.println("nextLine: " + nextLine);


//        int number = scanner.nextInt();
//        System.out.println(number);

//        System.out.println("Please enter integer number");
//        if (scanner.hasNextInt()) {
//            int number = scanner.nextInt();
//            System.out.println(number);
//        } else {
//            System.out.println("Wrong data! Restart application");
//            System.exit(0);
//        }


        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);

    }


    static void demo3() {
//        int a = 10;
//        int b = 20;

//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a == b");
//        }


//        if (a >= b) {
//            System.out.println("a >= b");
//
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                System.out.println("a == b");
//            }
//        } else {
//            System.out.println("a < b");
//        }


//        if (a < b) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }


        // Тернарний оператор
        // умову ? вираз1 : вираз2

//        System.out.println((a < b) ? "YES" : "NO");


//        if (a <= b) {
//            if (a < b) {
//                System.out.println("a < b");
//            } else {
//                System.out.println("a == b");
//            }
//        } else {
//            System.out.println("NO");
//        }


//        System.out.println((a <= b) ? (a < b) ? "a < b" : "a == b" : "NO");


//        if (10 > 20)
//            System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");


//        int a = 11;

//        if (a == 1) {
//            System.out.println("1");
//        } else if (a == 2) {
//            System.out.println("2");
//        } else if (a == 3) {
//            System.out.println("3");
//        } else if (a == 4) {
//            System.out.println("4");
//        }



//        switch (a) {
//            case 1 : {
//                System.out.println("1");
//                break;
//            }
//            case 2 : {
//                System.out.println("2");
//                break;
//            }
//            case 3 : {
//                System.out.println("3");
//                break;
//            }
//            case 4 : {
//                System.out.println("4");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//
//        }



//        String str = "AAA";
//
//        switch (str) {
//            case "QQQ": {
//                System.out.println("Q");
//                break;
//            }
//            case "AAA": {
//                System.out.println("A");
//                break;
//            }
//            case "BBB": {
//                System.out.println("B");
//                break;
//            }
//        }
    }


    static void demo2() {
        //        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;


//        System.out.println((a < b) && (b > c));
//        System.out.println((a > b) || (b > c));
//        System.out.println();
//
//        System.out.println((a > b) || (b > c) || (c < d));
//
//        System.out.println();
//        System.out.println();

//        System.out.println("b = " + b);
//        System.out.println((a > b) && (++b > c));
//        System.out.println("b = " + b);


        //-------------------------------------------//


        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

//        System.out.println((10 < 20) && (30 > 40) || (30 < 40));
//        System.out.println((30 < 20) && ((20 > 10) || (30 < 40) && (20 > 10)));


    }

    static void demo1() {
        int a = 10;
        int b = 20;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println();
        System.out.println();


        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println();

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println();

        System.out.println(a != b);

        boolean someBooleanVariable = false;
        System.out.println();
        System.out.println();

        System.out.println(someBooleanVariable);
        System.out.println(!someBooleanVariable);
    }
}
