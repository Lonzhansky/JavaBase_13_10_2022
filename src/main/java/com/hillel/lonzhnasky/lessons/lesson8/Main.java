package com.hillel.lonzhnasky.lessons.lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Створити масив із N чисел (вводимо з консолі)
        // Розбити його на 2 масиви рівної довжини
        // Відсортувати першу половину масиву за зростанням та вивести на екран
        // другу половину масиву відсортувати у зворотному порядку і теж вивести на екран


        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Please enter array length");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Wrong data! Please enter positive number bigger then 0");
                }
                if (n % 2 != 0) {
                    n = -1;
                    System.out.println("Wrong data! number must be even");
                }
            } else {
                System.out.println("Wrong data! Please try again");
            }
            scanner.nextLine();

        } while (n <= 0);


        Integer[] array = new Integer[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        System.out.println(Arrays.toString(array));

        int middle = n / 2;
        Integer[] arr1 = new Integer[middle];
        Integer[] arr2 = new Integer[middle];

        System.arraycopy(array, 0, arr1, 0, middle);
        System.arraycopy(array, middle, arr2, 0, middle);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.println("after sort");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));




    }








    static void demo2() {
        //        int[] array1 = {1, 2, 3, 6, 8, 9};
//
//        int[] array2 = Arrays.copyOf(array1, 10);
//        int[] array2 = Arrays.copyOfRange(array1, 2, 4);
//
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

//        int[] array1 = {1, 2, 3, 6, 8, 9};
//        int[] array2 = new int[array1.length];
//        System.arraycopy(array1, 2, array2, array2.length - 2, 2);
//
//        System.out.println(Arrays.toString(array2));
    }


    static void demo() {
        int[] array = {5, 1, 2, 99, 5, 4, 2, 8, 97, 4};

//         {1, 5, 2, 99, 5, 4, 2, 8, 97, 4};
//         {1, 2, 5, 99, 5, 4, 2, 8, 97, 4};
//         {1, 2, 5, 99, 5, 4, 2, 8, 97, 4};
//         {1, 2, 5, 5, 99, 4, 2, 8, 97, 4};
//         {1, 2, 5, 5, 4, 99, 2, 8, 97, 4};


//        int counter = 0;
//        int temp = -1;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    temp = array[j];
//                    array[j] = array[j+ 1];
//                    array[j+ 1] = temp;
//                }
//            }
//        }

//        System.out.println(Arrays.toString(array));
//        System.out.println("counter = " + counter);


        Arrays.sort(array);
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));


//        int[] array = {5, 1, 2, 99, 5, 4, 2, 8, 97, 4};


//        int max = array[array.length - 1];
//        int min = array[0];


        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

//            max = Math.max(max, array[i]);
//            min = Math.min(min, array[i]);

        }

        System.out.println(min);
        System.out.println(max);
    }

    static void demoBigO() {

//        // O(N)
//        for (int i = 0; i < 5; i++) {
//
//        }
//
//        // O(N)
//        for (int i = 0; i < 5; i++) {
//
//        }

        // O(2N) = O(N)

//        // O(N) * O(N) = O(N^2)
//        int counter = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 2; j++) {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//
//        // O(N) * O(N) * O(N) = O(N^3)
//        counter = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < 3; k++) {
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println(counter);
    }

    static void demoDoWhile() {

        int x = 5;
//        while (x <= 2) {
//            System.out.println("Hello");
//            x++;
//        }


//        do {
//            System.out.println("Hello");
//            x++;
//        } while (false);

        int counter = 0;
        for (int i = 123; counter < 100; i++) {
            int number = i;
            int result = number % 10;
            boolean ok = true;
            do {
                if (result == 4 || result == 9) {
                    ok = false;
                    break;
                }
                number /= 10;
                result = number % 10;
            } while (number > 0);

            if (ok) {
                System.out.println("number: " + i);
                counter++;
            }

        }

        System.out.println("count = " + counter);
    }
}
