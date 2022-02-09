package by.training.task1;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        int number, a, b, c, d;
        boolean result;

        System.out.println("Введите четырёхзначное число: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        a = number / 1000;
        b = number % 1000 / 100;
        c = number % 100 / 10;
        d = number % 10;

        result = a + b == c + d;

        System.out.println(result);

    }
}
