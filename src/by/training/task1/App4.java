package by.training.task1;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        int x, y;

        System.out.println("Введите координаты точки: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x>=-4&x<=4&y<=0&y>=-3 | x>=-2&x<=2&y>=0&y<=4){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
