package com.Meenakshi.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


    @RestController
    public class EmpController {
        @GetMapping("/employees")
        public List<Employee> getAllEmployees() {
            List<Employee> employees = new ArrayList<>();
            employees.add(null);
            return employees;
        }
    }
