package com.Lekciya2;

class   eleventhTask {
    public static void  main (String[] args){
        int numberA = 1;
        int numberB = 0;
        for(int i = 1; i <99; i+=2){
            numberA = numberA + 2;
            numberB = numberB+numberA ;

        }System.out.println(numberB+1);



    }
}