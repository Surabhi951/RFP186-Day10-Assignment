package com.bridgelabz.employeeWage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME__HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAY_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        int empPresent = (int) (Math.floor(Math.random()*10) % 3);
        int dayCount = 1;
        while (dayCount <= WORKING_DAY_PER_MONTH) {
            int empWage = 0;
            switch(empPresent){
                case IS_FULL_TIME:
                    empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee FULL-TIME");
                    break;
                case IS_PART_TIME:
                    empWage = WAGE_PER_HOUR * PART_TIME__HOUR;
                    System.out.println("Employee PART-TIME");
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println("Employee daily wage: " + dayCount + " =>" + empWage);
            dayCount++;
        }
    }
}
