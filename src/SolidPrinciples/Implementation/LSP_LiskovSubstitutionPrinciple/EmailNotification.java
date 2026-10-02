package SolidPrinciples.Implementation.LSP_LiskovSubstitutionPrinciple;

public class EmailNotification implements Notification{

    @Override
    public void send(String message){
        System.out.println("Sending Email:"+message) ;

    }
}
