package com.bridgelabz.employeeWage;

public class EmployeeWage {
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME__HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    static void computeEmpWage(String company, int WAGE_PER_HOUR, int WORKING_DAY_PER_MONTH, int WORKING_HOUR_PER_MONTH) {
        int empPresent = (int) (Math.floor(Math.random() * 10) % 3);
        int dayCount = 1;
        int workingHours = 0;
        int totalWage = 0;
        while (dayCount <= WORKING_DAY_PER_MONTH && workingHours <= WORKING_HOUR_PER_MONTH) {
            int empWage = 0;
            switch (empPresent) {
                case IS_FULL_TIME:
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    workingHours += FULL_DAY_HOUR;
                    System.out.println("Employee FULL-TIME");
                    break;
                case IS_PART_TIME:
                    empWage = WAGE_PER_HOUR * PART_TIME__HOUR;
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
        System.out.println("Total wage for company: " + company + " is: " + totalWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        computeEmpWage("Amazon", 20, 2, 10 );
        computeEmpWage("Meesho", 10, 4, 20 );
        computeEmpWage("Reliance", 10, 3, 10 );
        computeEmpWage("Flipcart", 15, 5, 30 );
    }
}
