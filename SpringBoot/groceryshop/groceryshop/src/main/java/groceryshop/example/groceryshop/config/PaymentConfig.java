package groceryshop.example.groceryshop.config;

import groceryshop.example.groceryshop.model.PaymentService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentService paymentService() {

        return new PaymentService("UPI");
    }
}