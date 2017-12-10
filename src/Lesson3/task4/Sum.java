package Lesson3.task4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите два целых числа");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            System.out.println("Введите второе число");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                c = a + b;
                System.out.println("Сумма = " + c);
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }
    }
}
