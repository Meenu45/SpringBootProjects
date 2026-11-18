package firstapp.example.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/home")
    String getHome(){
        return "hello!!!!!!!!!!!";
    }
}
