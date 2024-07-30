package com.java.employeewagecomputation;

public class EmployeeWage {
	public static void main(String []args) {
		System.out.println("Welcome to Employee Wage ComputationProgram");
		 int wagePerHour = 20;
	        int fullDay = 8;
	        int halfDay = 4;
	        System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
	        System.out.println("");

	        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	        switch ( empCheck ) {
	            case 0:
	                System.out.print("Employee is Present");
	                System.out.println("");
	                System.out.print("The daily wage of Employee is : " + (wagePerHour * fullDay));
	                System.out.println("");
	                break;

	            case 1:
	                System.out.print("Employee is Present but working part time ");
	                System.out.println("");
	                System.out.print("The daily wage of Employee is : " + (wagePerHour * halfDay));
	                System.out.println("");
	                break;

	            case 2:
	                System.out.print("Employee is Absent");
	                System.out.println("");
	                System.out.println("The daily wage of Employee is : 0 ");
	                System.out.println("");
	                break;

	        }

	
	}

}
