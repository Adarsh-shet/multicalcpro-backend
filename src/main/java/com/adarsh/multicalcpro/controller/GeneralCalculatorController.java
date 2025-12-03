package com.adarsh.multicalcpro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET})
public class GeneralCalculatorController {

    @GetMapping("/general")
    public double calculate(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam String operation
    ) {
        return switch (operation) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> b != 0 ? a / b : 0;
            default -> 0;
        };
    }
}
