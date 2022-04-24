package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask1 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(1, 10);
            System.out.print(masiv[i] + " ");
        }


        int proizvedenie = 1;
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 3 == 0) {
                proizvedenie = proizvedenie * masiv[i];
            }

        }
        if (proizvedenie == 1) {
            System.out.println("В массиве нет чисел кратных трем ");
        } else {
            System.out.println("Произведение " + proizvedenie);
        }
    }
}