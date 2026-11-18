package groceryshop.example.groceryshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ProductConfig.class,
        PaymentConfig.class,
        DeliveryConfig.class
})
public class GroceryshopConfig {
}
