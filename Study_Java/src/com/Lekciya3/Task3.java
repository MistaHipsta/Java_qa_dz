package com.Lekciya3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] masive1 = new int[15];
        int x = 0;
        for (int i = 0; i < masive1.length; i++) {

            masive1[x] = random.nextInt(99);//назначаем рандоомное значение в ячейку х
            System.out.print(masive1[x] + " ");
            x++;//переходим в следующую ячейку
        }
        System.out.println();

        int chetnoecheslo = 0;
        int t = 0;
        for (int i = 0; i < masive1.length; i++) {

            int f = masive1[t];
            f = f % 2;//проверяем четность числа в ячейке
            t++;//продвигаемся к следующей ячейке
            if (f == 0) {
                chetnoecheslo++;//увеличиваем счетчик
            }

        }
        System.out.print("Количество четных чисел " + chetnoecheslo);

    }

}




