package com.Lekciya3;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] masiv1 = new int[10];
        int[] masiv2 = new int[10];
        double[] masiv3 = new double[10];
        Random random = new Random();
        System.out.print("Первый массив ");
        for (int i = 0; i < masiv1.length; i++) {
            masiv1[i] = random.nextInt(9);
            System.out.print(masiv1[i] + " ");
        }
        System.out.println();
        System.out.print("Второй массив ");
        for (int i = 0; i < masiv2.length; i++) {
            masiv2[i] = random.nextInt(1, 9);
            System.out.print(masiv2[i] + " ");
        }
        System.out.println();
        System.out.print("Третий массив ");
        double chastnoe = 0;
        int index = 0;
        for (int i = 0; i < masiv1.length; i++) {
            chastnoe = (double) masiv1[i] / (double) masiv2[i];
            index = i;
            masiv3[i] = (float) chastnoe;
            System.out.print(masiv3[i] + " ");

        }System.out.println();
        System.out.print("Целые числа ");
        int summaCelih =0;
        for (int i = 0; i < masiv3.length; i++) {
            if (masiv3[i] % 1 == 0) {
                System.out.print(masiv3[i] + " ");
            summaCelih++;
            }

        }
        System.out.println();
        System.out.println("Сумма целых чисел третьего массива " + summaCelih);


    }

}
