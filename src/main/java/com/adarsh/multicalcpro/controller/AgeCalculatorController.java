package com.adarsh.multicalcpro.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET})
public class AgeCalculatorController {

    @GetMapping("/age")
    public int calculateAge(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
