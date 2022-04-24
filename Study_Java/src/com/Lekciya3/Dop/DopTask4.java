package com.Lekciya3.Dop;

import java.util.Random;

public class DopTask4 {

    public static void main(String[] args) {
        int[] masiv = new int[10];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(10);
            System.out.print(masiv[i] + " ");
        }

        int naimenshee = masiv[0];
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] % 2 != 0 && naimenshee > masiv[i]) {
                naimenshee = masiv[i];
            }
        }System.out.println();
        System.out.println("Наименьший не четный элемент: " + naimenshee);

    }



}

