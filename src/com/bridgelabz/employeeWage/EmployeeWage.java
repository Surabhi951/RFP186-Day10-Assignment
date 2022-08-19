package com.bridgelabz.employeeWage;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Amazon", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Meesho", 10, 4, 20);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 3, 10);
        empWageBuilder.addCompanyEmpWage("Flipcart", 15, 5, 30);
        empWageBuilder.computeEmpWage();
    }
}
