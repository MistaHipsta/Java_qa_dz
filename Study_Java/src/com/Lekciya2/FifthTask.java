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
        int numberH = 3;
        if (numberA<0){
            numberD++;
            numberH--;
        }

        if (numberB<0){
            numberD++;
            numberH--;
        }
        if (numberC<0){
            numberD++;
            numberH--;
        }
        System.out.print("Отрицательных чисел: " + numberD + " и колличество положительных: " + numberH);
    }
}