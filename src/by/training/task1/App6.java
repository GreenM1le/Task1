package by.training.task1;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        int a,b,c,sum;

        System.out.println("Введите 3 числа: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a>b&a>c&b<c | b>a&b>c&a<c){
            sum = a+b;
        } else if(c>a&c>b&b<a | b>a&b>c&c<a){
            sum = b+c;
        } else {
            sum = a+c;
        }
        System.out.println(sum);
    }
}
