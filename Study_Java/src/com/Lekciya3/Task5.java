package com.Lekciya3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] masiv1 = new int[5];
        int[] masiv2 = new int[5];
        Random random = new Random();

        int summa1 = 0;

        for (int i = 0; i < masiv1.length; i++) {
            masiv1[i] = random.nextInt(15);
            System.out.print(masiv1[i] + " ");
            summa1 = summa1 + masiv1[i];

        }
        System.out.println();
        int srednee = summa1 / 5;
        System.out.println("Srednee " + srednee);
        System.out.println();

        int summa2 = 0;
        for (int i = 0; i < masiv2.length; i++) {
            masiv2[i] = random.nextInt(15);
            System.out.print(masiv2[i] + " ");
            summa2 = summa2 + masiv2[i];
        }
        System.out.println();
        int srednee2 = summa2 / 5;
        System.out.println("Srednee " + srednee2);
        System.out.println();

        if (srednee>srednee2){
            System.out.println("Среднее значение для первого массива больше");
        }else {
            System.out.println("Среднее значение для втоого массива больше");
        }

    }
}