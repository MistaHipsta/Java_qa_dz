package com.Lekciya2;

import java.util.Scanner;

public class SixthTask {

    public static void main(String[] args) {
        System.out.println("Введите число ваших програмистов: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tail = number%10;
        int tail2 =number%100;

        if (number==1&&tail2!=11||tail2!=11&&(tail==1&number!=11)){
            System.out.println(number + " Програмист");
        }else if (tail>=5 ||
                tail==0||
                tail2==11||
                tail2==12||
                tail2==13||
                tail2==14){
            System.out.println(number + " Програмистов");
        }else if (tail>=2||tail<=4&tail>1){
            System.out.println(number + " Програмиста");
        }

    }
}