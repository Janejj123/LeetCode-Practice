package practiceCode;

import java.util.*;

public class Midterm_2 {
    static double dice(int N) {

        int dice1 = 0;
        int dice2 = 0;
        int rollCount = 0;
        int runs = N;

        while (runs-- > 0) {
            dice1 = 0;
            dice2 = 0;
            while (dice1 + dice2 != 7) {
                dice1 = new Random().nextInt(6) + 1;
                dice2 = new Random().nextInt(6) + 1;
                rollCount++;
            }
        }
        return rollCount / N;
    }

    public static void main(String[] args) {
        double res = Midterm_2.dice(100);
        System.out.println(res);
    }
}
