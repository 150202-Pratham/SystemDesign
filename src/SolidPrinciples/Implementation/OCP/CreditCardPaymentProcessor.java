package SolidPrinciples.Implementation.OCP;

public class CreditCardPaymentProcessor extends PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit card payment of $" + amount);

    }
}

