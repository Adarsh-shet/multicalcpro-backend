package com.adarsh.multicalcpro.service;

import com.adarsh.multicalcpro.dto.ExperienceResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class ExperienceCalculatorService {

    public ExperienceResponse calculateExperience(LocalDate start, LocalDate end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Start date and end date are required");
        }
        if (end.isBefore(start)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
        Period period = Period.between(start, end);
        return new ExperienceResponse(period.getYears(), period.getMonths(), period.getDays());
    }
}
