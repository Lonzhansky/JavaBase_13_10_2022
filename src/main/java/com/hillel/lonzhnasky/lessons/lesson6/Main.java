package com.hillel.lonzhnasky.lessons.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        FOR

//        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
//              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
//              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
//              )
//              {
//                  код
//              }


//        for (int i = 0; true; i++) {
//
//            if (i == 5 || i == 4) {
//                continue;
//            }
//
//            System.out.println(i);
//
//            if (i == 5) {
//                break;
//            }
//        }


//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ


//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

//        int number1 = 0;
//        int number2 = 1;
//        int sum;
//        System.out.print(number1 + " " + number2 + " ");
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//            number1 = number2;
//            number2 = sum;
//        }

//        Scanner scanner = new Scanner(System.in);
//        for (;;) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                System.out.println("You entered number: " + number);
//                break;
//            } else {
//                System.out.println("Wrong data, try again!");
//                scanner.nextLine();
//            }
//        }


//      WHILE

//        int i = 0;
//        while (true) {
//            i++;
//            if (i >= 10) {
//                break;
//            }
//            if (i == 5 || i == 7) {
//                continue;
//            }
//            System.out.println("Hello world - " + i);
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                System.out.println("You entered number: " + number);
//                break;
//            } else {
//                System.out.println("Wrong data, try again!");
//                scanner.nextLine();
//            }
//        }

//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        int i = 10;
//        while (i >= 0) {
//            int randomNumber = (int) (Math.random() * 101);
//            System.out.println(i);
//            if (randomNumber >= 85 && randomNumber <= 100) {
//                System.out.println("WIN!!!!");
//                break;
//            }
//            if (i == 0) {
//                System.out.println("BOOOOOM!!!!");
//            }
//            i--;
//        }

//        2)
//        Обчислити факторіал числа від 0 до N (вводимо з консолі) (1 - 10)
//        5! = 1 * 2 * 3 * 4 * 5;
//        3! = 1 * 2 * 3;

//        Scanner scanner = new Scanner(System.in);
//        int numberForFactorial = -1;
//
//        while (true) {
//            System.out.println("Please enter number from 1 to 10");
//            if (scanner.hasNextInt()) {
//                numberForFactorial = scanner.nextInt();
//                if (numberForFactorial >= 1 && numberForFactorial <= 10) {
//                    break;
//                } else {
//                    System.out.println("ENTER FROM 1 TO 10");
//                }
//            } else {
//                System.out.println("Wrong data, try again");
//                scanner.nextLine();
//            }
//        }
//
//        //        5! = 1 * 2 * 3 * 4 * 5;
//        int result = 1;
//        for (int i = 1; i <= numberForFactorial; i++) {
////            result = result * i;
//            result *= i;
//        }
//
//        System.out.println(result);


//        int a = 3;
//        int b = 11;
//
//        System.out.println(0 + "" + 0 + "" + Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println();
//
//        System.out.println(a ^ b);
//        System.out.println(Integer.toBinaryString(a ^ b));


//        3) Homework
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

        int counter = 0;
        for (int i = 10; i <= 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            System.out.println("shuttle number: " + i);
            counter++;
        }

        System.out.println(counter);

    }
}