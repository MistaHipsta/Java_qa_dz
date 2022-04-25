package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask7 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();
        int chislo = random.nextInt(8);
        System.out.println("Рандомное число из задачи - " + chislo);

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(15);
            System.out.print(masiv[i] + " ");
        }
        int kolichestvo = 0;
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i]==chislo) {
                kolichestvo++;
            }
        }
        System.out.println();
        System.out.println("Число встречается " + kolichestvo + " раз");
    }
}