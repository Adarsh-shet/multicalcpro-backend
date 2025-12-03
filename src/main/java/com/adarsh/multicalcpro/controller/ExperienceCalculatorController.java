package com.adarsh.multicalcpro.controller;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET})
public class ExperienceCalculatorController {

    @GetMapping("/experience")
    public Map<String, Integer> calculateExperience(@RequestParam String start, @RequestParam String end) {
        LocalDate s = LocalDate.parse(start);
        LocalDate e = LocalDate.parse(end);
        Period p = Period.between(s, e);

        Map<String, Integer> resp = new LinkedHashMap<>();
        resp.put("years", p.getYears());
        resp.put("months", p.getMonths());
        resp.put("days", p.getDays());
        return resp;
    }
}
