import java.util.Scanner;

public class SeventhTask {

    public static void main(String[] args) {
        int day = 0;
        int firstDay = 10;
        int percentByFirstDay = (int) (firstDay * 0.10);
        int secondDay = firstDay+percentByFirstDay;
        int percentBySecondDay = (int) (secondDay * 0.10);
        int thirdDay = secondDay+percentBySecondDay;
        int percentByThirdDay = (int) (thirdDay * 0.10);
        int fourDay = thirdDay+percentByThirdDay;
        int percentByfourDay = (int) (fourDay * 0.10);
        int fiveDay = fourDay+percentByfourDay;
        int percentByFiveDay = (int) (fourDay * 0.10);
        int sixDay = fiveDay+percentByFiveDay;
        int percentBySixDay = (int) (fiveDay * 0.10);
        int sevenDay = sixDay+percentBySixDay;
        int allDay = firstDay+secondDay+thirdDay+fourDay+fiveDay+sixDay+sevenDay;
        System.out.println(allDay);

    }
}