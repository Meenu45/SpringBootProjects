package groceryshop.example.groceryshop.model;

public class DeliveryService {

    private String deliveryCompany;

    public DeliveryService(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public void deliver() {

        System.out.println("Delivery Partner: " + deliveryCompany);
        System.out.println("Grocery Delivered Successfully!");
    }
}