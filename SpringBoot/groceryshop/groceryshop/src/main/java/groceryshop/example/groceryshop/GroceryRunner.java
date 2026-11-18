package groceryshop.example.groceryshop;

import groceryshop.example.groceryshop.model.GroceryProduct;
import groceryshop.example.groceryshop.model.PaymentService;
import groceryshop.example.groceryshop.model.DeliveryService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GroceryRunner implements CommandLineRunner {

    private final ApplicationContext context;

    public GroceryRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {

        GroceryProduct rice =
                context.getBean("rice", GroceryProduct.class);

        GroceryProduct milk =
                context.getBean("milk", GroceryProduct.class);

        GroceryProduct sugar =
                context.getBean("sugar", GroceryProduct.class);

        PaymentService payment =
                context.getBean("paymentService", PaymentService.class);

        DeliveryService delivery =
                context.getBean("deliveryService", DeliveryService.class);

        System.out.println("\n===== GROCERY SHOP APPLICATION =====");

        System.out.println("\n--- Available Grocery Products ---");

        rice.displayProduct();
        milk.displayProduct();
        sugar.displayProduct();

        System.out.println("\n--- Payment Details ---");
        payment.pay();

        System.out.println("\n--- Delivery Details ---");
        delivery.deliver();
    }
}