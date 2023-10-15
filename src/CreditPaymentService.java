public class CreditPaymentService {
    public double calculate(double creditSumm, double percent, double monthsCount) {

        double annCoeff;
        double percentForFormula = percent / 12;
        double percentForFormula2 = percentForFormula / 100;
        double x1 = Math.pow((1 + percentForFormula2), monthsCount);
        annCoeff = ((percentForFormula2 * x1) / (x1 - 1));
        double annPayment;
        annPayment = creditSumm * annCoeff;
        double result = annPayment;
        return result;

    }
}
