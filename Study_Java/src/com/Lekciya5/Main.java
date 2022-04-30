package com.Lekciya5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kompukter kompukter = new Kompukter();

        kompukter.onPc(scanner);
        kompukter.offPc(scanner);
    }
}
