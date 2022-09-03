package codewithshayan.mortgage;

public class MortgageCalculator {

    private int principle;
    private float annualInterest;
    private byte year;

    public MortgageCalculator(int principle, float annualInterest, byte year) {
        this.principle = principle;
        this.annualInterest = annualInterest;
        this.year = year;
    }

    public double calculateMortgage() {
        short numberOfPay = getNumberOfPay();
        float monthlyInterest = getMonthlyInterest();

        double mort = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPay))
                / (Math.pow(1 + monthlyInterest, numberOfPay) - 1);

        return mort;
    }

    public double payementSchedule(short p) {

        // c = monthlyInterest
        float c = getMonthlyInterest();

        // n = numberOfPay
        short n = getNumberOfPay();

        double b = principle * (Math.pow(1 + c, n) - Math.pow(1 + c, p)) / (Math.pow(1 + c, n) - 1);
        return b;
    }


    public double[] getRemainBalances(){
        var balances = new double[getNumberOfPay()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month -1] = payementSchedule(month);
        }
        return balances;
    }

    private short getNumberOfPay() {
        return (short) (year * 12);
    }
    private float getMonthlyInterest() {
        return (annualInterest / 100) / 12;
    }

}
