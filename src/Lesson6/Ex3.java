package Lesson6;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        char c = 'a';
        String[][] fps = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 6; y++) {
                fps[i][y] = c + "" + (y + 1);

            }
            c++;
        }
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 6; y++) {
                System.out.println(Arrays.deepToString(fps)+ "");
            }
        }  System.out.println();
    }
}