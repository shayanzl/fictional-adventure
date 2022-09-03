package codewithshayan.mortgage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
    final private NumberFormat nf =
            NumberFormat.getCurrencyInstance(Locale.US);
    private static Scanner x =
            new Scanner(System.in);

    private int principal;
    private float annualInterest;
    private byte year;


    public void showMort(){
        principal = (int) readNumber("principal", 1000, 1_000_000);
        annualInterest =  (float) readNumber("annual interest rate: ", 1, 30);
        year = (byte) readNumber("years: ", 1, 30);
        printMort();
        printPaymentSchedule();
    }


    private void printMort(){
        double mortgage = calculateMortgage();
        String mortCurrency = nf.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payements: " + mortCurrency);
    }


    private void printPaymentSchedule(){
        System.out.println();
        System.out.println("payement schedule");
        System.out.println("--------");
        for ( short month = 1; month <= year*12 ; month++){
            double balance = payementSchedule(month);
            System.out.println(nf.format(balance));
        }
    }



    private double readNumber(String promt, double min, double max){
        double value;
        while( true ){
            System.out.println(promt);
            value = x.nextDouble();
            if ( value >= min && value <= max)
                break;
            else
                System.out.println("Enter a valid num between "+ min +" and "+ max);
        }
        return value;
    }

    private double calculateMortgage(){
        short numberOfPay = (short)(year * 12);
        float monthlyInterest = (annualInterest /100) / 12;
        return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPay))
                / (Math.pow(1 + monthlyInterest, numberOfPay) - 1);
    }

    private double payementSchedule(short p){

        // c = monthlyInterest
        float monthlyInterest = annualInterest / 100 / 12;

        // n = numberOfPay
        short numberOfPay = (short) (year * 12);

        return (principal *
                (Math.pow(1 + monthlyInterest, numberOfPay) - Math.pow(1 + monthlyInterest, p)))
                / (Math.pow(1 + monthlyInterest, numberOfPay) - 1);
    }

}
