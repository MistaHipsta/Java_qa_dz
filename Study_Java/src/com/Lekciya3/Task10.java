package com.Lekciya3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите ваше число больше трёх: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        Random random = new Random();
        for (; userNumber <= 3; ) {
            System.out.println("Нужно ввести число больше трёх: ");
            System.out.println("Введите ваше число больше трёх: ");
            userNumber = scanner.nextInt();
        }
        int[] masiv1 = new int[userNumber];
        int sumChe = 0;
        for (int i = 0; i < masiv1.length; i++) {
            masiv1[i] = random.nextInt(userNumber);
            System.out.print(masiv1[i] + " ");
            if (masiv1[i] % 2 == 0) {
                sumChe++;
            }
        }
        System.out.println();
        int[] masiv2 = new int[sumChe];
        int masB = 0;
        for (int i = 0; i < masiv1.length; i++) {
            if (masiv1[i] % 2 == 0) {
                masiv2[masB] = masiv1[i];
                System.out.print(masiv2[masB] + " ");
                masB++;
            }
        }
    }
}