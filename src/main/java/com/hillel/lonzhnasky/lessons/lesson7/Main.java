package com.hillel.lonzhnasky.lessons.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] team1 = new int[10];
        int[] team2 = new int[10];

        for (int i = 0; i < team1.length; i++) {
            System.out.println("Please enter frags for player " + (i + 1) + " from team 1");
            if (scanner.hasNext()) {
                team1[i] = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Wrong data");
            }
        }

        for (int i = 0; i < team2.length; i++) {
            System.out.println("Please enter frags for player " + (i + 1) + " from team 2");
            if (scanner.hasNext()) {
                team2[i] = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Wrong data");
            }
        }

        int sumTeam1 = 0;
        int sumTeam2 = 0;


        for (int value : team1) {
            sumTeam1 += value;
        }
        for (int value : team2) {
            sumTeam2 += value;
        }

        double avgTeam1 = ((double) sumTeam1) / team1.length;
        double avgTeam2 = ((double) sumTeam2) / team2.length;

        System.out.println(avgTeam1);
        System.out.println(avgTeam2);

    }


    static void demo() {
        //        int[] array = new int[5];
//
//        array[0] = 5;
//        array[1] = 2;
//        array[2] = 4;
//        array[3] = 1;
//        array[4] = 23;
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

//        int[] array2 = new int[] {1, 2, 3, 4, 5};
//        int[] array3 = {1, 2, 3, 4, 5};
//
//
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 10) {
//                System.out.println("WIN!!!");
//            }
//            System.out.println(array[i]);
//        }

//        System.out.println(Arrays.toString(array));


//        int[] array = null;
//
//        // NPE
////        array[0] = 10;
//
//        if (array != null) {
//            array[0] = 10;
//        }
    }


    static void demo2() {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(array.length);
        System.out.println(array[array.length - 1]);

        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();


        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    static void demo3() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2[0] = 99;
        System.out.println();

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }


    static void test1() {
        //   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому

        int[] array = new int[10];

//        array[0] = (int) (Math.random() * 11);
//        array[1] = (int) (Math.random() * 11);
//        array[2] = (int) (Math.random() * 11);
//        array[3] = (int) (Math.random() * 11);
//        array[4] = (int) (Math.random() * 11);
//        array[5] = (int) (Math.random() * 11);
//        array[6] = (int) (Math.random() * 11);
//        array[7] = (int) (Math.random() * 11);
//        array[8] = (int) (Math.random() * 11);
//        array[9] = (int) (Math.random() * 11);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
//      0, 4, 9, 6, 5, 9, 3, 3, 3, 6
//        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }


    static void task2() {
        /*
     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.
*/


        int[] array = {1, 44, 98, 44, 22, 33, 55, 22, 98, 10};

        // version 1
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 101);
//        }

//        System.out.println(Arrays.toString(array));
//
//        int maxValue = -1;
//        for (int i : array) {
////            if (i > maxValue) {
////                maxValue = i;
////            }
//            maxValue = Math.max(i, maxValue);
//        }
//
//        System.out.println("killer percentage " + maxValue);

        // version 2 hard

        int maxValue = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        System.out.println("max value = " + maxValue);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                System.out.println("index:" + i + ", chance: " + maxValue);
            }
        }
    }

    static void task3() {


/*
     У вашій баскетбольній команді 10 людей. Очки гравців основного
     складу записані в парні комірки масиву, а запасних гравців - у
     непарні. Написати функцію, яка знайде наскільки більше балів
     заробив основний склад щодо запасних гравців.
*/

        int[] team = new int[10];

        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 11);
        }

        System.out.println(Arrays.toString(team));

        int sumTeamMain = 0;
        int sumTeamReserve = 0;

        for (int i = 0; i < team.length; i++) {
            if (i % 2 == 0) {
                sumTeamMain += team[i];
            } else {
                sumTeamReserve += team[i];
            }
        }

        System.out.println(sumTeamMain);
        System.out.println(sumTeamReserve);

        if (sumTeamMain > sumTeamReserve) {
            System.out.println("team main have more points than team reserve: " + (sumTeamMain - sumTeamReserve));
        } else if (sumTeamMain < sumTeamReserve) {
            System.out.println("team reserve have more points than team main: " + (sumTeamReserve - sumTeamMain));
        } else {
            System.out.println("draw");
        }
    }
}
