package com.seenu;

import java.util.*;
public class test {
	 public static void main(String[] args) {
		 ArrayList<Employee> employee = new ArrayList<Employee>();
		 employee.add(new Employee(113, "seenu"));
		 employee.add(new Employee(110, "suvvy"));
		 employee.add(new Employee(112, "akhil"));
		 employee.add(new Employee(111, "mini"));
		 Collections.sort(employee,Collections.reverseOrder());
		 for(Employee emp :employee) {
			 System.out.println(emp.id+" "+emp.name);
		  }
		}
	 }