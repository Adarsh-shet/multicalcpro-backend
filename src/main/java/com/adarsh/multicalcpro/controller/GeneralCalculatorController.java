package com.adarsh.multicalcpro.controller;

import com.adarsh.multicalcpro.service.GeneralCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})// allow frontend access
public class GeneralCalculatorController {

    private final GeneralCalculatorService generalCalculatorService;

    @GetMapping("/general")
    public double generalCalculator(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam String operation
    ) {
        return generalCalculatorService.calculate(a, b, operation);
    }
}
