package com.hillel.lonzhnasky.lessons.lesson9;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[][][] array = new int[3][2][4];
//        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//        };


//        System.out.println(array.length);
//
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//
//        System.out.println(array[0][0].length);
//        System.out.println(array[0][1].length);
//
//
//        System.out.println(array[2][0][0]);
//        System.out.println(array[2][0][1]);
//        System.out.println(array[2][0][2]);
//        System.out.println(array[2][0][3]);


//        System.out.println(Arrays.deepToString(array));
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//
//
//        System.out.println(Arrays.toString(array[2][0]));


//        int[][][][] array = new int[1][3][6][6];

        int[][][][] array =
                {
                        {
                                {
                                        {18, 28, 18, 28},
                                        {45, 90, 45, 0}
                                },
                                {
                                        {7, 125, 500, 5},
                                        {0, 11, 25, 30}
                                },
                                {
                                        {81, 17, 19, 55},
                                        {1, 7, 38, 11}
                                }
                        },
                        {
                                {
                                        {18, 28, 18, 28},
                                        {45, 90, 45, 0}
                                },
                                {
                                        {7, 125, 500, 5},
                                        {0, 11, 25, 30}
                                },
                                {
                                        {81, 17, 19, 55},
                                        {1, 7, 38, 11}
                                }
                        }
                };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }


    }


    static void task2() {

//      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W  // 00, 02, 04, 06 - 0, 2, 4, 6
//      W B W B W B W B  // 11, 13, 15, 17 - 2, 4, 6, 8
//      B W B W B W B W  // 20, 22, 24, 26 - 2, 4, 6, 8
//      W B W B W B W B  // 31, 33, 35, 37 - 4, 6, 8, 10
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B


        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    array[i][j] = "B";
//                } else {
//                    array[i][j] = "W";
//                }

                array[i][j] = ((i + j) % 2 == 0) ? "B" : "W";
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

    }


    static void task1() {
// Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//      1 0 0 0 0       // 0 0
//      0 1 0 0 0       // 1 1
//      0 0 1 0 0       // 2 2
//      0 0 0 1 0       // 3 3
//      0 0 0 0 1       // 4 4

//      0 0 0 0 1       // 0 4
//      0 0 0 1 0       // 1 3
//      0 0 1 0 0       // 2 2
//      0 1 0 0 0       // 3 1
//      1 0 0 0 0       // 4 0


        int[][] array = new int[5][5];


        // Перша дiагональ
        //version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }

//        version 2
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }


        // Друга дiагональ
        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        // version 2
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            if (i + j == array.length - 1) {
//                array[i][j] = 1;
//            }
//        }

        // version 3
        for (int i = 0; i < array.length; i++) {
            array[i][array[i].length - 1 - i] = 1;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    static void demo() {
        // Двовимiрнi масиви
        //        int[][] array = new int[3][3];
//
//
//        System.out.println(array.length);

        //Створення масиву i заповненя значеннями
//        int[][] array = {
//                {1, 2, 3},  //00, 01, 02
//                {2, 3, 4},  //10, 11, 12
//                {5, 6, 7},   //20, 21, 22
//                {1, 2, 4}   //20, 21, 22
//        };
//
        // Довжина масиву + кiлькiсть стовбцiв
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[3].length);
//
//
//        System.out.println(Arrays.deepToString(array));
//
//
        // Друкування масиву
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


        // Зубчатий масив
//        int[][] array = {
//                {1, 2, 3, 4, 5, 2, 5},
//                {2},
//                {5, 6, 7},
//                {1, 2, 4, 34},
//                {},
//                {3, 3, 3}
//        };
//
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[3].length);
//
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
