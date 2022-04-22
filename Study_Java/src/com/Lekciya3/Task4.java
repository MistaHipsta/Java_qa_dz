package com.Lekciya3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] masiv1 = new int[20];
        Random random = new Random();
        int x = 0;
        for (int i = 0; i < masiv1.length; i++) {

            masiv1[x] = random.nextInt(20);//назначаем рандоомное значение в ячейку х
            System.out.print(masiv1[x] + " ");
            x++;//переходим в следующую ячейку
        }
        System.out.println();
        for (int w = 0; w <20; w++) {
            if (w%2!=0){ //проверяем индекс ячейки на не четность
                masiv1[w]=0;//если он не четный, заменяем его на 0
            }
            System.out.print(masiv1[w]+" ");
        }


    }
}