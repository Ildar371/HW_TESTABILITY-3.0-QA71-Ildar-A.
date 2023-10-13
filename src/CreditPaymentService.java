public class CreditPaymentService {
    public double calculate(double creditSumm, double percent, double monthsCount) {

    double annCoeff;
    double x1 = Math.pow(1 + percent, monthsCount);
    annCoeff = ((percent*x1)/(x1-1));
    double annPayment;
    annPayment = creditSumm*annCoeff;
    double result = annPayment;
        return result;

}
}
