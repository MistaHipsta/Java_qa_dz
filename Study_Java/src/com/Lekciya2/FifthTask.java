package com.Lekciya2;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {

        System.out.println("Введите ваше число \"A\": ");

        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();

        System.out.println("Введите ваше число \"B\": ");

        scanner = new Scanner(System.in);
        int numberB = scanner.nextInt();

        System.out.println("Введите ваше число \"C\": ");

        scanner = new Scanner(System.in);
        int numberC = scanner.nextInt();
        int numberD = 0;
        if (numberA<0){
            numberD++;
        }
        if (numberB<0){
            numberD++;
        }
        if (numberC<0){
            numberD++;
        }
        System.out.print("Отрицательных чисел:");
        System.out.println(numberD);
    }
}