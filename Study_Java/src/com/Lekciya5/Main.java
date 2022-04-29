package com.Lekciya5;

public class Main {
    public static void main(String[] args) {
        Kompukter kompukter = new Kompukter();

        kompukter.hdd=5;
        kompukter.off=100;
        kompukter.on=100;
        kompukter.proc="Intel";
        kompukter.ram=4;
        kompukter.rabotaet=true;

        System.out.println(kompukter.hdd);
        System.out.println(kompukter.off);
        System.out.println(kompukter.on);
        System.out.println(kompukter.proc);
        System.out.println(kompukter.ram);
        System.out.println(kompukter.rabotaet);

    }
}
