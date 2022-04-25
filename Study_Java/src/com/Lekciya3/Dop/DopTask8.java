package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask8 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(15);
            System.out.print(masiv[i] + " ");
        }
        int element = 0,ind=0;
        for (int i = 0; i < masiv.length; i++) {
            if (element<masiv[i]){
                element=masiv[i];
                ind++;
            }

        }
        System.out.println();
        System.out.println(element);


    }
}