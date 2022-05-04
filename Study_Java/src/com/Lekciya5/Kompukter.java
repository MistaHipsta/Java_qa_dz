package com.Lekciya5;

import java.util.Random;
import java.util.Scanner;

public class Kompukter {
    Random random = new Random();

    String proc;
    int ram;
    int hdd;
    int resurs = 5;
    int off;
    public static int schetchikRaboti = 0;


    public void pcInfo() {
        System.out.println("Информация о ваше ПК: Процессор: " + proc + " Оперативка: " + ram + "Гб" +" Ваш жесткий диск: " + hdd + "Тб");

    }

    public void onPc(Scanner scanner) {
        System.out.println("Выберите и введите число для включения 0 или 1:");

        scanner = new Scanner(System.in);
        int chislo = scanner.nextInt();
        int randomChislo = random.nextInt( 2);
        for (; chislo > 1; ) {
            System.out.println("Нужно выбрать между 0 и 1, затем ввести его: ");
            chislo = scanner.nextInt();
            schetchikRaboti++;
        }
        if (chislo != randomChislo || schetchikRaboti == resurs) {
            System.out.println("Твой ПК сгорел");
            System.exit(0);
        } else {
            System.out.println("Твой ПК включился удачно");
            schetchikRaboti++;
        }

    }


    public void offPc(Scanner scanner) {
        System.out.println("Выберите и введите число для выключения 0 или 1:");
        int chislo = scanner.nextInt();
        int randomChislo = random.nextInt(2);
        for (; chislo > 1; ) {
            System.out.println("Нужно выбрать между 0 и 1, затем ввести его: ");
            chislo = scanner.nextInt();
            schetchikRaboti++;
        }
        if (chislo != randomChislo || schetchikRaboti == 5) {
            System.out.println("Твой ПК сгорел");
            System.exit(0);
        } else {
            System.out.println("Твой ПК выключился удачно");
            schetchikRaboti++;
        }
    }
}