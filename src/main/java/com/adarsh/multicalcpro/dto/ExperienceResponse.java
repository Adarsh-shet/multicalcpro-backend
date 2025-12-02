package com.adarsh.multicalcpro.dto;

public class ExperienceResponse {
    private int years;
    private int months;
    private int days;

    public ExperienceResponse() {}

    public ExperienceResponse(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }

    // getters and setters
    public int getYears() { return years; }
    public void setYears(int years) { this.years = years; }
    public int getMonths() { return months; }
    public void setMonths(int months) { this.months = months; }
    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }
}
