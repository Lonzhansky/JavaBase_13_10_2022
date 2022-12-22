package com.hillel.lonzhnasky.lessons.lesson16;


// Задано метод, який приймає масив.
// Реалізувати пошук елементу массиву. Повертати номер комірки
// Якщо не знайшли, повернути -1
// Якщо масив порожній, повернути -2.
// Якщо масив дорівнює null, повернути -3.


// 1, 2, 3, 4, 5  |  value 3
public class ArrayUtil {

    public static int getIndexElementInArray(int[] array, final int element) {


        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return -4;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }
}
