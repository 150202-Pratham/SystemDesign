package Patterns.StrategyPattern;

public class Card_Payment implements Payment{
    String cardNumber ;

    public Card_Payment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Total amount paid is "+ amount);
    }
}
