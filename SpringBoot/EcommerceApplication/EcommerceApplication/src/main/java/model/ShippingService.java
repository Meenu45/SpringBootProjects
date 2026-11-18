package model;

public class ShippingService {

    private String company;

    public ShippingService(String company) {
        this.company = company;
    }

    public void ship() {

        System.out.println("Shipping Company: " + company);
        System.out.println("Product Shipped Successfully!");
    }
}