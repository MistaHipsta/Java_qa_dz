package com.Lekciya3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] masiv = new int[4];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(10);
            System.out.print(masiv[i] + " ");
        }
        boolean peremen = false;
        for (int i = 0; i < masiv.length - 1; i++) {

            if (masiv[i] >= masiv[i + 1]) {
                peremen = true;
            }
        }
        if (peremen) {
            System.out.println("Последовательность не возрастающая");

        }else
        {
            System.out.println("Последовательность строго возрастающая");

        }
    }

}
