package groceryshop.example.groceryshop.config;

import groceryshop.example.groceryshop.model.GroceryProduct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
public class ProductConfig {

    @Bean
    public GroceryProduct rice() {
        return new GroceryProduct("Basmati Rice", 1200);
    }

    @Bean
    public GroceryProduct milk() {
        return new GroceryProduct("Amul Milk", 60);
    }

    @Bean
    public GroceryProduct sugar() {
        return new GroceryProduct("Sugar", 50);
    }
}
