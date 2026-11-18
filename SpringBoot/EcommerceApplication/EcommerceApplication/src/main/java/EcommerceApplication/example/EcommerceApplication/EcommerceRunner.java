package EcommerceApplication.example.EcommerceApplication;

import model.PaymentService;
import model.Product;
import model.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EcommerceRunner implements CommandLineRunner {

    private final ApplicationContext context;

    public EcommerceRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {

        Product product = context.getBean(Product.class);

        PaymentService payment =
                context.getBean(PaymentService.class);

        ShippingService shipping =
                context.getBean(ShippingService.class);

        System.out.println("\n===== E-COMMERCE APPLICATION =====");

        product.displayProduct();

        payment.pay();

        shipping.ship();
    }
}