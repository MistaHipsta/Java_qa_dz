package com.Lekciya3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        System.out.println("Введите ваше положительное, четное число: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
            for (; userNumber <=1 || userNumber%2>0; ) {
                System.out.println("Нужно ввести положительное и четное: ");
                System.out.println("Введите ваше положительное, четное число: ");
                userNumber = scanner.nextInt();

            }

        int[] masiv = new int[userNumber];
        int polovinaA = userNumber / 2;
        Random random = new Random();


        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = random.nextInt(15);
            System.out.print(masiv[i] + " ");
        }
        System.out.println();
        int summaA = 0;
        for (int i = 0; i < polovinaA; i++) {
            summaA = summaA + masiv[i];
        }
        System.out.println("Сумма половины слева " + summaA);

        System.out.println();
        int summaB = 0;
        for (int i = polovinaA; i < userNumber; i++) {
            summaB = summaB + masiv[i];
        }
        System.out.println("Сумма половины справа " + summaB);
        System.out.println();
        if (summaA > summaB) {
            System.out.println("Половина слева больше ");
        } else {
            System.out.println("Половина справа больше");
        }
    }
}
