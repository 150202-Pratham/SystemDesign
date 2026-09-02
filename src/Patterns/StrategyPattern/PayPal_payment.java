package Patterns.StrategyPattern;

public class PayPal_payment  implements Payment {

     String email ;

    public void pay(double amount){
        System.out.println("Payment for PayPal is "+amount);
    }

    public PayPal_payment(String email){
        this.email = email ;
    }

}
