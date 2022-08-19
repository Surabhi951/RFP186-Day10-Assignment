package com.bridgelabz.employeeWage;

public class CompanyEmpWage {
    String company;
    int wagePerHour;
    int workingDayPerMonth;
    int workingHourPerMonth;
    int totalWage;

    public CompanyEmpWage(String company, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDayPerMonth = workingDayPerMonth;
        this.workingHourPerMonth = workingHourPerMonth;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "company='" + company + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", workingDayPerMonth=" + workingDayPerMonth +
                ", workingHourPerMonth=" + workingHourPerMonth +
                ", totalWage=" + totalWage +
                '}';
    }
}
