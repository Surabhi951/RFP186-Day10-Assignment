package com.bridgelabz.employeeWage;

public class EmpWageBuilder {
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME__HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    String company;
    int wagePerHour;
    int workingDayPerMonth;
    int workingHourPerMonth;
    int totalWage;

    public EmpWageBuilder(String company, int wagePerHour, int workingDayPerMonth, int workingHourPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDayPerMonth = workingDayPerMonth;
        this.workingHourPerMonth = workingHourPerMonth;
    }

    @Override
    public String toString() {
        return "Total wage for company: " + company + " is: " + totalWage;
    }

    void computeEmpWage(){
        int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
        int dayCount = 1;
        int workingHours = 0;

        while (dayCount <= workingDayPerMonth && workingHours <= workingHourPerMonth) {
            int empWage = 0;
            switch (empPresent) {
                case IS_FULL_TIME:
                    empWage = wagePerHour * FULL_DAY_HOUR;
                    workingHours += FULL_DAY_HOUR;
                    System.out.println("Employee FULL-TIME");
                    break;
                case IS_PART_TIME:
                    empWage = wagePerHour * PART_TIME__HOUR;
                    workingHours += PART_TIME__HOUR;
                    System.out.println("Employee PART-TIME");
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
            totalWage += empWage;
            System.out.println("Employee daily wage Day : " + dayCount + " => " + empWage);
            dayCount++;
        }
        System.out.println("working Hours: " + workingHours);
    }
}
