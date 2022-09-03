package codewithshayan.mortgage;

public class Main {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("annual interest rate: ", 1, 30);
        byte year = (byte) Console.readNumber("years: ", 1, 30);
        var calculator = new MortgageCalculator(principal, annualInterest, year);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}
