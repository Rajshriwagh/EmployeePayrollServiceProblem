package com.employee_payroll;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class EmployeePayrollFileIOService {
	public static String PAYROLL_FILE_NAME = "D:\\BridgeLabz\\EmployeePayroll\\src\\main\\java\\PayrollFile.txt";
	  public void write(List<EmployeePayRollData> employeePayrollList) {
	    StringBuffer empBuffer = new StringBuffer();
	    employeePayrollList.forEach(employee ->{
	        String empDataString = employee.toString().concat("\n");
	        empBuffer.append(empDataString);
	    });
	    try {
	        Files.write(Paths.get(PAYROLL_FILE_NAME),empBuffer.toString().getBytes());
	    }catch (IOException x){
	        x.printStackTrace();
	    }
	}

	public void printData() {
	    try {
	        Files.lines(new File(PAYROLL_FILE_NAME).toPath())
	                .forEach(System.out::println);
	    }catch (IOException x){
	        x.printStackTrace();
	    }
	}
}
