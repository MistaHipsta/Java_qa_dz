package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask2 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(1, 10);
            System.out.print(masiv[i] + " ");
        }

        int summa = 0, kolichestvo = 0;
        for (int i = 0; i < masiv.length; i++) {
            if (i % 2 != 0) {
                summa = summa + masiv[i];
                kolichestvo++;
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое элементов с нечетным номером (индексом) " + (double)summa/kolichestvo);
    }
}