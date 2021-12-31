package org.encapsulationConcept;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class usingMap {
	
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
		
		Map <Integer, EmployeeDetails> mp = new LinkedHashMap();
		mp.put(1, e);
		mp.put(2, e1);
		mp.put(3, e2);
		Set<Entry<Integer, EmployeeDetails>> set = mp.entrySet();
				
		int count =0;
		for (Entry<Integer, EmployeeDetails> employee : set) {
			System.out.println("\nEmployee no: " +(count+1));
			System.out.println("Employee ID: " +employee.getValue().getEmpID());
			System.out.println("Employee Name: " +employee.getValue().getEmpName());
			System.out.println("Employee Phone: " +employee.getValue().getEmpPh());
			count ++;
		}
		
		
	}

}
