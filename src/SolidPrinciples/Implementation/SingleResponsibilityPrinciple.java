package SolidPrinciples.Implementation;

public class SingleResponsibilityPrinciple {

//    class RestaurantEmployee {
//
//        public void cookPizza() {
//            System.out.println("Cooking Pizza...");
//        }
//
//        public void deliverPizza() {
//            System.out.println("Delivering Pizza...");
//        }
//
//        public void collectPayment() {
//            System.out.println("Collecting Payment...");
//        }
//    }

//    This is the Old Version where we didn't know about SRP
    static class Restaurant {

        private final Chef chef = new Chef();
        private final DeliveryBoy deliveryBoy = new DeliveryBoy();
        private final Cashier cashier = new Cashier();

        public void processOrder() {
            chef.cookPizza();
            cashier.collectPayment();
            deliveryBoy.deliverPizza();
        }
    }

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.processOrder();
    }



}
