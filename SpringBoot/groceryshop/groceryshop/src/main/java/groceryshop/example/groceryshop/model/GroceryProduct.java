package groceryshop.example.groceryshop.model;

public class GroceryProduct {

    private String name;
    private double price;

    public GroceryProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {

        System.out.println("Grocery Product: " + name);
        System.out.println("Price: ₹" + price);
    }
}