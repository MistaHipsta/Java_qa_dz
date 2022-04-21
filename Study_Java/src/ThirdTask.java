import java.util.Scanner;

import static java.lang.System.*;

public class thirdTask {
    public static void main(String[] args) {

        out.println("Введите целое число:");
        Scanner scanner = new Scanner(in);
        int num = scanner.nextInt();

        if (num>0){
           int num2 = num+1;
        System.out.print("Мы прибавили к вашему числу \"1\" и получилось:");
            System.out.println(num2);
        }else if (num<0){
            int num2 = num-2;
            System.out.print("Мы отняли от вашего числа \"2\" и получилось:");
            System.out.println(num2);
        }
        else {
            int num2 = 10;
            System.out.print("К сожалению у вас \"0\", поэтому мы выводим:");
            out.println(num2);
        }
    }
}
