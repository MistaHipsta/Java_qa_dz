package com.Lekciya3;

public class Task2 {
    public static void main(String[] args) {
        int r = 99 / 2;//узнаем колличество четных чисел
        int t = 99-r;//знаем колличество не четных
        int[] masive1 = new int[t];
        int x = 0; //начальная ячейка массива
        for (int i = 1; i <= 99; i++) {
            int a = (i % 2);
            if (a != 0) {
                masive1[x] = i;//ячейка массива
                System.out.print(masive1[x] + " "); //для удобства чтения добавил пробел
                x++;//увеличили номер ячейки, продвинулись вперед
            }

        }
        System.out.println();
        for (int p = masive1.length-1; p >= 0; --p) {
            System.out.print(masive1[p]+" ");
        }
    }
}