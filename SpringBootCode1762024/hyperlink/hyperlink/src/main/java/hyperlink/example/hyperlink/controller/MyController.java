package hyperlink.example.hyperlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
//        return "Successfully Establish Communication Between html and servlet page using hyperlink.";
    }
}
