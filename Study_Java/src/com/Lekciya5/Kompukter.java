package com.Lekciya5;

import java.util.Random;
import java.util.Scanner;

public class Kompukter {
    Random random = new Random();

    String proc;
    int ram;
    int hdd;
    int on;
    int off;
    public static int schetchikRaboti = 0;


    public String getProc() {
        return proc;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getOn() {
        return on;
    }

    public int getOff() {
        return off;
    }


    public void onPc(Scanner scanner) {
        System.out.println("Выберите и введите число для включения 0 или 1:");

        scanner = new Scanner(System.in);
        int chislo = scanner.nextInt();
        int randomChislo = random.nextInt(0, 1);
        for (; chislo > 1; ) {
            System.out.println("Нужно выбрать между 0 и 1, затем ввести его: ");
            chislo = scanner.nextInt();
            schetchikRaboti++;
        }
            if (chislo == randomChislo || schetchikRaboti == 5) {
                System.out.println("Твой ПК сгорел");
                System.exit(0);
            } else {
                System.out.println("Твой ПК включился удачно");
            }

        }


    public void offPc(Scanner scanner) {
        System.out.println("Выберите и введите число для выключения 0 или 1:");
        int chislo = scanner.nextInt();
        int randomChislo = random.nextInt(1);
        for (; chislo > 1; ) {
            System.out.println("Нужно выбрать между 0 и 1, затем ввести его: ");
            chislo = scanner.nextInt();
            schetchikRaboti++;
        }
        if (chislo == randomChislo||schetchikRaboti==5) {
            System.out.println("Твой ПК сгорел");
            System.exit(0);
        } else {
            System.out.println("Твой ПК выключился удачно");
        }
    }
}
