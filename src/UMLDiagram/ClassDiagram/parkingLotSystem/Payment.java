package UMLDiagram.ClassDiagram.parkingLotSystem;

import UMLDiagram.ClassDiagram.parkingLotSystem.Enums.PaymentMethod;
import UMLDiagram.ClassDiagram.parkingLotSystem.Enums.PaymentStatus;

public class Payment {

    private PaymentStatus paymentStatus ;
    private double amount ;
    private PaymentMethod paymentType ;

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentMethod paymentType) {
        this.paymentType = paymentType;
    }
}
