package Lesson5;

import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);
        double faktorial = 1;
        for (int a = 1; a <= i; a++) {
            faktorial = faktorial * a;
        }
        System.out.println(faktorial);
    }
}

