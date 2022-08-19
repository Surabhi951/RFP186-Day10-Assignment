package com.bridgelabz.employeeWage;

public class EmpWageBuilder implements ICompanyWage{
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME__HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    int noOfCompany = 0;
    CompanyEmpWage[] companyEmpWages = new CompanyEmpWage[5];

    public void addCompanyEmpWage(String company, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
        companyEmpWages[noOfCompany] = new CompanyEmpWage(company,wagePerHour,workingDayPerMonth,workingHourPerMonth);
        noOfCompany++;
    }

    public void computeEmpWage(){
        for(int i = 0; i < noOfCompany; i++){
            computeEmpWage(companyEmpWages[i]);
        }
    }

    void computeEmpWage(CompanyEmpWage companyEmpWage){
        int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
        int dayCount = 1;
        int workingHours = 0;
        int totalWage = 0;

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
    }
}
