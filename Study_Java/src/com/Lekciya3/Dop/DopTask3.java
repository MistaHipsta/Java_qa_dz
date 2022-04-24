package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask3 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();
        int chislo = random.nextInt(8);
        System.out.println("Рандомное число (С) из задачи - " + chislo);
        System.out.println("Массив: ");
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(10);
            System.out.print(masiv[i] + " ");
        }
        int summa = 0, kolichestvo = 0;
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i]>chislo) {
                summa = summa + masiv[i];
                kolichestvo++;
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое чисел больше числа (С): " + summa/kolichestvo);

    }
}