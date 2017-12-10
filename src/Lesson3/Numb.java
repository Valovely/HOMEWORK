package Lesson3;
import java.util.Scanner;
public class Numb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print("Введите целое число");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.println("Число является четным");
            } else {
                System.out.println("Число нечетное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
