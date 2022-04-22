package com.Lekciya2;

import java.util.Scanner;

public class FirstTask {

   public static void main(String[] args) {

      System.out.println("Введите ваше число: ");

      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();

      if (number < 10 && number>-10) {

         System.out.println("Ваше число однозначное");

         if (number > 0) {

            System.out.println("Ваше число положительное");
         }
         else if (number==0){
             System.out.println("0 не положительно и не отрицательное");
         }
         else {
            System.out.println("Ваше число отрицательное");
         }
      }

       else if (number < 100&& number>-100) {
         System.out.println("Ваше число двухзначное");
         if (number > 0) {

            System.out.println("Ваше число положительное");
         }
         else {
            System.out.println("Ваше число отрицательное");
         }

      }
       else if (number < 1000&& number>-1000) {
         System.out.println("Ваше число трехзначное");
         if (number > 0) {

            System.out.println("Ваше число положительное");
         }
         else {
            System.out.println("Ваше число отрицательное");
         }
      }
      else {
         System.out.println("Ваше число четырехзначное или больше");
      }
   }
}

