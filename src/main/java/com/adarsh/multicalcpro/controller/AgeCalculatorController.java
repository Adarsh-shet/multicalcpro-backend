package com.adarsh.multicalcpro.controller;

import com.adarsh.multicalcpro.service.AgeCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/calculator")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AgeCalculatorController {

    private final AgeCalculatorService ageCalculatorService;

    @GetMapping("/age")
    public int calculateAge(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob
    ) {
        return ageCalculatorService.calculateAge(dob);
    }
}
