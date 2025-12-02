package com.adarsh.multicalcpro.service;

import org.springframework.stereotype.Service;

@Service
public class GeneralCalculatorService {

    public double calculate(double a, double b, String operation) {
        return switch (operation.toLowerCase()) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> {
                if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        };
    }
}
