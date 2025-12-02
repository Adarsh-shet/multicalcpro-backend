package com.adarsh.multicalcpro.controller;

import com.adarsh.multicalcpro.dto.ExperienceResponse;
import com.adarsh.multicalcpro.service.ExperienceCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/calculator")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ExperienceCalculatorController {

    private final ExperienceCalculatorService experienceCalculatorService;

    @GetMapping("/experience")
    public ExperienceResponse calculateExperience(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end
    ) {
        return experienceCalculatorService.calculateExperience(start, end);
    }
}
