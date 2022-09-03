package codewithshayan.mortgage;

import java.util.Scanner;

public class Console {
    public static double readNumber(String promt, double min, double max) {
        Scanner x = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(promt);
            value = x.nextFloat();
            if (value > min && value <= max)
                break;

            System.out.println("Enter a valid rate between " + min + "and " + max);
        }
        return value;
    }
}
