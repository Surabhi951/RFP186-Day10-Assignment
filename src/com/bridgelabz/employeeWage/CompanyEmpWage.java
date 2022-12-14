package com.bridgelabz.employeeWage;

interface ICompanyWage{
    void addCompanyEmpWage(String company, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth);
    void computeEmpWage();
    int totalWageByCompany(String company);
}

public class CompanyEmpWage {
   final String company;
   final int wagePerHour;
   final int workingDayPerMonth;
   final int workingHourPerMonth;
    int totalWage;

    public CompanyEmpWage(String company, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDayPerMonth = workingDayPerMonth;
        this.workingHourPerMonth = workingHourPerMonth;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
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
