package Patterns.StrategyPattern;

// this class act as a Context class that helps us to delegate work to it instead of Implementing Itself

public class ShoppingCart {

    public Payment paymentStrategy ;

    public ShoppingCart(Payment paymentStrategy){
        this.paymentStrategy = paymentStrategy ;
    }
//    Now in Future if we need to change the strategy then we need to implement method setPaymentStrategy()
    public void setPaymentStrategy(Payment paymentStrategy){
        this.paymentStrategy = paymentStrategy ;

    }

//    This method is used to calculate the total amount you need to pass to the paymentStrategy ;
    public void totalAmount(double amount){
        paymentStrategy.pay(amount);
    }


}
