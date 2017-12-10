import java.util.Random;
import java.util.Scanner;


public class TaskGarland {
    static int garland = 40;
    public static void main(String[] args) {

        running(garland, 10);
       bloom();
    }

    public static void running(int garland, int count) {
        for (int i = 0; i < count; i++) {
            if (garland < 0) {
                garland = garland << 1;
                garland++;
            } else {
                garland <<= 1;
                System.out.println(Integer.toBinaryString(garland));
            }
        }

    }

    public static void bloom() {
        for (int y= 0; y < 5; y++){
                garland = ~garland;
            System.out.println(Integer.toBinaryString(garland));
        }

    }
}

