package com.Lekciya3;

public class Task1 {
    public static void main(String[] args) {
        int t = 20 / 2; //узнаем нужную длинну массива
        int[] masive1 = new int[t];
        int x = 0; //начальная ячейка массива
        for (int i = 2; i <= 20; i++) {
            int a = (i % 2);
            if (a == 0) {
                masive1[x] = i;//ячейка массива
                System.out.print(masive1[x] + " ");
                x++;//увеличили номер ячейки, продвинулись вперед
            }

        }
        for (int p = 0; p <= masive1.length-1; p++) {
            System.out.println(masive1[p]);
            System.out.println();
        }

    }
}


