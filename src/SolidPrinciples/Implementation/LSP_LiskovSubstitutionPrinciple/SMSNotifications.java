package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple;

public class SMSNotifications implements Notification {

    @Override
    public void send(String message){
        System.out.println("Sending SMS:"+message) ;

    }
}
