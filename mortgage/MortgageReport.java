package codewithshayan.mortgage;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {
    private final NumberFormat nf;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        nf = NumberFormat.getCurrencyInstance(Locale.US);
    }


    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("payement schedule");
        System.out.println("--------");
        for (double balance : calculator.getRemainBalances())
            System.out.println(nf.format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortCurrency = nf.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payements: " + mortCurrency);
    }
}
