package Patterns.StrategyPattern;



public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new Card_Payment("456-789-123")) ;
        shoppingCart.totalAmount(100000.45);

        shoppingCart.setPaymentStrategy(new PayPal_payment("pratham@gmail.com"));
        shoppingCart.totalAmount(200000.35) ;

    }
}
