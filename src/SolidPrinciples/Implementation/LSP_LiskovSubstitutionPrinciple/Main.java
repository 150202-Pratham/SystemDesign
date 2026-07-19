package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Notification sms = new SMSNotifications() ;
        sms.send("Aapko Succhit kiya jaata hai ki aapka data pack Kal tak samapaat ho jayega" +
                "Kirpa Jaldi Recharge karein"+ "Dial Karke 90119011") ;

        Notification message = new PushNotification() ;
        message.send("Hello , Kaise hoo App sabh") ;

//        See here we are replacing the method made by parent class by the base class and also
//        we kept this in mind that parent class is not causing any unexpected Behaviour

    }

}
