import java.util.Scanner;

public class SixthTask {

    public static void main(String[] args) {
        System.out.println("Введите число ваших програмистов: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tail = number%10;
switch (tail){
    case 1:
        System.out.println(number + " Програмист");
        break;
    case 2:
        System.out.println(number + " Програмиста");
        break;
    case 3:
        System.out.println(number + " Програмиста");
        break;
    case 4:
        System.out.println(number + " Програмиста");
        break;
}
    }
}