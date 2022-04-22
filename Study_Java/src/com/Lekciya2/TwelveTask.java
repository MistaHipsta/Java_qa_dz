package com.Lekciya2;

class TwelveTask {
    public static void main(String[] args) {
        int i = 3;
        int w = 0;
        for (; i >= 0; --i) {
            for (int a = 0; a <= i; a++) {
                System.out.print(" ");
            }
            for (int b = 3; b >= i; --b) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    for (; w <= 3; w++){

        for (int b = 0; b <= w; b++) {
            System.out.print(" ");
        }
        for (int a = 3; a >= w; --a){
           System.out.print("*");
       }
       System.out.println();
    }
    }
}