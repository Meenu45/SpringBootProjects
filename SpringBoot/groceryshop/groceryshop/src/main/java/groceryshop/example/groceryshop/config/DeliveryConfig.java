package groceryshop.example.groceryshop.config;

import groceryshop.example.groceryshop.model.DeliveryService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeliveryConfig {

    @Bean
    public DeliveryService deliveryService() {

        return new DeliveryService("Blinkit");
    }
}