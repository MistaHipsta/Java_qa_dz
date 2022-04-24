package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask6 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(15);
            System.out.print(masiv[i] + " ");
        }

        int shagMass = 1;
        for (int i = 0; i < masiv.length-1; i++) {
            if (masiv[shagMass] == masiv[i]) {
                i=masiv.length;
                System.out.println("Не различны ");
            }else {
                i=masiv.length;
                System.out.println("Различны ");
            }
            shagMass++;
        }


    }
}