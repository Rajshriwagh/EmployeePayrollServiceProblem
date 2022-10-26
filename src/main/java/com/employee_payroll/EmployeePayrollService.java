package com.employee_payroll;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayRollData> employeePayrollList;
	public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO};

	public EmployeePayrollService() {
		this.employeePayrollList = new ArrayList<EmployeePayRollData>();
	}

	private void readEmployeePayroll(Scanner consoleINputReader) {
		System.out.println("Enter Employee ID: ");
		int id = consoleINputReader.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = consoleINputReader.next();
		System.out.println("Enter Employee Salary: ");
		double salary = consoleINputReader.nextDouble();
		employeePayrollList.add(new EmployeePayRollData(id, name, salary));
	}

	private void writeEmployeePayroll() {
		System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Payroll Service program");
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		Scanner consoleINputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayroll(consoleINputReader);
		employeePayrollService.writeEmployeePayroll();
	}

}