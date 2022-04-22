package com.Lekciya2;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        System.out.println("Введите сторону треугольника \"А\": ");
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();

        System.out.println("Введите сторону треугольника \"B\": ");
        scanner = new Scanner(System.in);
        int sideB = scanner.nextInt();

        System.out.println("Введите сторону треугольника \"C\": ");
        scanner = new Scanner(System.in);
        int sideC = scanner.nextInt();

        if (sideA>sideC+sideB||sideB>sideC+sideA||sideC>sideB+sideA){
            System.out.println("Такого треугольника не может быть");
        }else if (sideA<sideC+sideB){
            System.out.println("Это очень хороший треугольник");
        }

}
}
