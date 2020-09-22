package practiceCode;

import java.util.Scanner;

public class Midterm {

    public static void main(String[] args) {
        int nyear = 0;
        int millenium = 3000;
        int years = 0;
        System.out.println("Please Enter the current year");
        Scanner cin = new Scanner(System.in);
        nyear = cin.nextInt();

        while (nyear != millenium)
        {
            nyear++;
            years++;
        }
        System.out.println("Another" + years + "years to the millenium.");
        //return 0;
    }
}
