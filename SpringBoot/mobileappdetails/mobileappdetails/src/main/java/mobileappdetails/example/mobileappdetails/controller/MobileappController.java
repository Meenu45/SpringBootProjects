package mobileappdetails.example.mobileappdetails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileappController {
    @PostMapping("/mobile")
    public String phoneDetails(

                @RequestParam String brand,
                @RequestParam String model,
                @RequestParam String price,
                @RequestParam String color,
                @RequestParam String ram) {

            return "<html>"
                    + "<head><title>Mobile Details</title></head>"
                    + "<body style='text-align:center; background-color:lightblue;'>"

                    + "<h2>Mobile Phone Details</h2>"

                    + "<p><b>Brand:</b> " + brand + "</p>"
                    + "<p><b>Model:</b> " + model + "</p>"
                    + "<p><b>Price:</b> ₹" + price + "</p>"
                    + "<p><b>Color:</b> " + color + "</p>"
                    + "<p><b>RAM:</b> " + ram + "</p>"

                    + "</body>"
                    + "</html>";
    }
}
