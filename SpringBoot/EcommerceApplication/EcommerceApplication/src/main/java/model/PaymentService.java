package model;

public class PaymentService {

    private String paymentMode;

    public PaymentService(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void pay() {
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Payment Successful!");
    }
}