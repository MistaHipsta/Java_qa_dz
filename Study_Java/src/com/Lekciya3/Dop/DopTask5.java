package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask5 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(10);
            System.out.print(masiv[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < masiv.length; i++) {
            if (i%2!=0){
                masiv[i]=0;
            }
            System.out.print(masiv[i]+" ");
        }


    }

}