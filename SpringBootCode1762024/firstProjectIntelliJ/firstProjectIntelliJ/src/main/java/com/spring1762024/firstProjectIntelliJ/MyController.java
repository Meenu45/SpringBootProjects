package com.spring1762024.firstProjectIntelliJ;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @RequestMapping("m")
    public static String myMethod(){
        return "<h1>Coding with Spring Boot Application</h1>";
    }
//    @GetMapping("process-form")
//        public static String getData(@RequestParam int num1 ,@RequestParam int num2){
//        int res = num1 +num2;
//        return "Result = "+res;
////        return String.valueOf(res);
//        }
    @PostMapping("process-form")
    public static String getData(@RequestParam int num1 ,@RequestParam int num2){
        int res = num1 +num2;
        return "Result = "+res;
//        return String.valueOf(res);

    }
}
