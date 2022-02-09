package by.training.task1;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        int a, b, p, s;
        double c;

        System.out.println("Введите длины двух катетов: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        p = (int) (a+b+c);
        s = (int) (0.5*(a*b));

        System.out.printf("Периметр: %d "+"площадь: %d", p, s);

    }
}
