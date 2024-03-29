package com.seenu;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Employee e1) {
		return name.compareTo(e1.name);
	}	
}
