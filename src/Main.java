
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSumm = 1_000_000;
        double percent = 9.99;
        double monthsCount = 12;
        double everyMonthPayment = service.calculate(creditSumm, percent, monthsCount);
        System.out.println("Ежемесячный платеж: " + everyMonthPayment);

        creditSumm = 1_000_000;
        percent = 9.99;
        monthsCount = 24;
        everyMonthPayment = service.calculate(creditSumm, percent, monthsCount);
        System.out.println("Ежемесячный платеж: " + everyMonthPayment);

        creditSumm = 1_000_000;
        percent = 9.99;
        monthsCount = 36;
        everyMonthPayment = service.calculate(creditSumm, percent, monthsCount);
        System.out.println("Ежемесячный платеж: " + everyMonthPayment);
    }
}