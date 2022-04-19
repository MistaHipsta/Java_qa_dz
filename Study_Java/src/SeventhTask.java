import java.util.Scanner;

public class SeventhTask {

    public static void main(String[] args) {
        double day=10; //за день
        double per=10; //процент за день
        double sum=0;//сумма за все дни

        for (int i = 0; i < 6; i++){
            double dayX = day * 0.1; //процент за день
            day+=dayX;//день с процентов сумма
            sum+=day;//сумма всех дней с процентом

       }System.out.println(sum+10);


    }
}