package Lesson4;
public class Task3{

        public static void main(String[] args) {
            double mid;
            double sum = 0;
            int i = 0;
            for (String m : args) {
                double d = Double.parseDouble(m);
                System.out.println(d);
                sum += d;
                i = i + 1;
            }
            mid = sum / i;
            System.out.println("Среднее число = " + mid);
        }
}