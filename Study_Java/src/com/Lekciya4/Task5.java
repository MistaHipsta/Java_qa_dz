package com.Lekciya4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Введите размер матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int masivRazmer = scanner.nextInt();
        int[][] masiv = new int[masivRazmer][masivRazmer];
        Random random = new Random();

        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv[i].length; j++) {
                masiv[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv.length; j++) {
                if (masiv[i][j] < 10) {
                    System.out.print(masiv[i][j] + "   ");
                } else {
                    System.out.print(masiv[i][j] + "  ");
                }
            }
            System.out.println();

        }System.out.println();

        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv.length; j++) {
                if (1==1){
                    masiv[i][j]=masiv[j][i];
                    System.out.print(masiv[i][j] + "  ");
                }

            }System.out.println();

        }

    }
}