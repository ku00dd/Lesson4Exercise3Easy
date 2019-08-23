/*3) Создать массив случайных чисел (размером 15 элементов). Создайте
второй массив в два раза больше, первые 15 элементов должны быть
равны элементам первого массива, а остальные элементы заполнить
удвоенных значением начальных. Например
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}*/
package com.gmail.dimaku1998;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int[] arrayCopy = Arrays.copyOf(array, array.length * 2);
        for (int j = arrayCopy.length / 2, k = 0; j < arrayCopy.length; j++, k++) {
            arrayCopy[j] = arrayCopy[k] * 2;
        }
        System.out.println(Arrays.toString(arrayCopy));
    }
}
