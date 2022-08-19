package com.bridgelabz.employeeWage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpWageBuilder implements ICompanyWage{
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME__HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    ArrayList<CompanyEmpWage> companyEmpWageArrayList = new ArrayList<>();
    Map<String,CompanyEmpWage> companyEmpWageMap = new HashMap<>();

    public void addCompanyEmpWage(String company, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,wagePerHour,workingDayPerMonth,workingHourPerMonth);
        companyEmpWageArrayList .add(companyEmpWage);
        companyEmpWageMap.put(company,companyEmpWage);
    }

    public void computeEmpWage(){
        for (CompanyEmpWage companyEmpWage : companyEmpWageArrayList){
            companyEmpWage.setTotalWage(computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    int computeEmpWage(CompanyEmpWage companyEmpWage){
        int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
        int dayCount = 1;
        int workingHours = 0;

        while (dayCount <= companyEmpWage.workingDayPerMonth && workingHours <= companyEmpWage.workingHourPerMonth) {
            int empWage = 0;
            switch (empPresent) {
                case IS_FULL_TIME:
                    empWage = companyEmpWage.wagePerHour * FULL_DAY_HOUR;
                    workingHours += FULL_DAY_HOUR;
                    System.out.println("Employee FULL-TIME");
                    break;
                case IS_PART_TIME:
                    empWage = companyEmpWage.wagePerHour * PART_TIME__HOUR;
                    workingHours += PART_TIME__HOUR;
                    System.out.println("Employee PART-TIME");
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
            companyEmpWage.totalWage += empWage;
            System.out.println("Employee daily wage Day : " + dayCount + " => " + empWage);
            dayCount++;
        }
        System.out.println("working Hours: " + workingHours);
        System.out.println("Total wage for company: " + companyEmpWage.company + " is: " + companyEmpWage.totalWage);
        return companyEmpWage.totalWage;
    }
}
