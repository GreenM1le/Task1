package by.training.task1;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Введите три действительных числа: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a>0){
            a*=a;
            System.out.println();
        } else {
            a = a*a*a*a;
        }
        if(b>0){
            b*=b;
            System.out.println();
        } else {
            b = b*b*b*b;
        }
        if(c>0){
            c*=c;
            System.out.println();
        } else {
            c = c*c*c*c;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
