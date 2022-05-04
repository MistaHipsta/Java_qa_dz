package com.Lekciya5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kompukter kompukter = new Kompukter();

        kompukter.proc = "Intel";
        kompukter.ram = 4;
        kompukter.hdd = 1;

        kompukter.pcInfo();
        kompukter.onPc(scanner);
        kompukter.offPc(scanner);
    }
}