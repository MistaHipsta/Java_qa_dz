package com.Lekciya3;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] masiv = new int[12];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(15);
            System.out.print(masiv[i] + " ");
        }
        int maxnumber = masiv[0];
        int index = 0;
        for (int i = 0; i < masiv.length; i++) {
            if (maxnumber<=masiv[i]){
                maxnumber=masiv[i];
                index=i;
            }

        }
        System.out.println();
        System.out.println("Максиальное число: " + maxnumber);
        System.out.println("Индекс масимального числа: " + index);
    }
}