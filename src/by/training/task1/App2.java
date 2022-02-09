package by.training.task1;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int a, b, c;
        double result;
        System.out.println("Введите 3 числа: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        result = ((b+(Math.sqrt((b*b)+(4*a*c)))/(2*a)))-((a*a*a*c)+(1/(b*b)));

        System.out.println(result);
    }
}
