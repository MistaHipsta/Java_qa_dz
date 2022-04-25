package com.Lekciya4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int masivRazmer = scanner.nextInt();
        int[][] masiv = new int[masivRazmer][masivRazmer];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv[i].length; j++) {
                masiv[i][j] = random.nextInt(10,50);
            }
        }
        for (int[] enclosedArray : masiv) {
            System.out.println(Arrays.toString(enclosedArray) + " ");
        }

        for (int i = 0; i <masiv.length; i++) {
            for (int j = 0; j < masiv[i].length; j++) {
                if (i==j && masiv[i][j] % 2== 0){
                    System.out.println(masiv[i][j]);
                }

            }

        }


    }


}

