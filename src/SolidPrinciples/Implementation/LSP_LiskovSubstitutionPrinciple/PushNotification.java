package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple;

public class PushNotification implements Notification{

    @Override
    public void send(String message){
        System.out.println("Sending Push message:"+message);
    }
}
