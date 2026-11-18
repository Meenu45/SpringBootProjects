package EcommerceApplication.example.EcommerceApplication.config;

import model.PaymentService;
import model.Product;
import model.ShippingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EcommerceConfig {

    @Bean
    public Product product() {
        return new Product("Laptop", 55000);
    }

    @Bean
    public PaymentService paymentService() {
        return new PaymentService("UPI");
    }

    @Bean
    public ShippingService shippingService() {
        return new ShippingService("BlueDart");
    }
}