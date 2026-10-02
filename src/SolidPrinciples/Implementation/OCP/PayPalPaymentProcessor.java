package SolidPrinciples.Implementation.OCP;

public class PayPalPaymentProcessor extends  PaymentProcessor {

    @Override
    public void processPayment(double amount){
        System.out.println("Processing PayPal payment of $"+amount);
    }
}
