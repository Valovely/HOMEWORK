package Lesson4;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Введите положительное число");
        if (sc.hasNextInt()) {
            i = sc.nextInt();

            if (i <= 10) {
                System.out.println("Положительное число меньше 10");
            }
        } else  {

            System.out.println("Положительное число больше 10 или отрицательное");
        }

    }
}







