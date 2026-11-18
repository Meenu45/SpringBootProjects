package loginuserpass.example.loginuserpass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// RestController to Controller annotation
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password) {

        if (username.equals("Meenakshi") && password.equals("Meen@1234")) {
            return "redirect:/welcome.html";
        } else {
            return "redirect:/error.html";
        }
}}