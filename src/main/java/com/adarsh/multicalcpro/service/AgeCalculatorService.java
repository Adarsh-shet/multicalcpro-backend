package com.adarsh.multicalcpro.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class AgeCalculatorService {

    public int calculateAge(LocalDate dob) {
        if (dob == null) {
            throw new IllegalArgumentException("Date of birth is required");
        }
        LocalDate today = LocalDate.now();
        if (dob.isAfter(today)) {
            throw new IllegalArgumentException("Date of birth cannot be in the future");
        }
        return Period.between(dob, today).getYears();
    }
}
