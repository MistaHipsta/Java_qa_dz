package com.Lekciya2;

class NinthTask {
    public static void  main (String[] args){
        int numberA = 1;
        int numberB = 0;
        for(int i = 0; i <=256; i += numberA){

            numberA = numberA * 2;
            numberB = numberB+numberA ;


        }System.out.println(numberB+1);

    }
}