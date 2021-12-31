package org.encapsulationConcept;

import java.util.ArrayList;
import java.util.List;

public class GetDetails {
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.setEmpID(125);
		e.setEmpName("Godwin");
		e.setEmpPh(9524978661l);
		
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setEmpID(542);
		e1.setEmpName("wise");
		e1.setEmpPh(9587569544l);
		
		EmployeeDetails e2 = new EmployeeDetails();
		e2.setEmpID(685);
		e2.setEmpName("God");
		e2.setEmpPh(9587569544l);
		
		List<EmployeeDetails> li = new ArrayList<EmployeeDetails>();
		li.add(e);
		li.add(e1);
		li.add(e2);
		
		int count =0;
		for (EmployeeDetails employee : li) {
			System.out.println("\nEmployee no: " +(count+1));
			System.out.println("Employee ID: " +employee.getEmpID());
			System.out.println("Employee Name: " +employee.getEmpName());
			System.out.println("Employee Phone: " +employee.getEmpPh());
			count ++;
		}
		
		
	}

}
