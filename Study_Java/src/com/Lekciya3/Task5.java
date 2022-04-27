package com.Lekciya3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] masiv1 = new int[10];
        int[] masiv2 = new int[10];
        Random random = new Random();

        int summa1 = 0;
        int kolichestvo = 0;
        for (int i = 0; i < masiv1.length; i++) {
            masiv1[i] = random.nextInt(15);
            System.out.print(masiv1[i] + " ");
            summa1 = summa1 + masiv1[i];
            kolichestvo++;

        }
        System.out.println();
        double srednee = summa1 / kolichestvo;
        System.out.println("Среднее арифметическое первого массива " + srednee);
        System.out.println();

        int summa2 = 0;
        int kolichestvo2 = 0;
        for (int i = 0; i < masiv2.length; i++) {
            masiv2[i] = random.nextInt(15);
            System.out.print(masiv2[i] + " ");
            summa2 = summa2 + masiv2[i];
            kolichestvo2++;
        }
        System.out.println();
        double srednee2 = summa2 / kolichestvo2;
        System.out.println("Среднее арифметическое второго массива " + srednee2);
        System.out.println();

        if (srednee>srednee2){
            System.out.println("Среднее арифметическое значение для первого массива больше");
        }else if (srednee<srednee2){
            System.out.println("Среднее арифметическое значение для второго массива больше");
        }else {
            System.out.println("Средние арифметические значения для двух массивов равны");
        }

    }
}