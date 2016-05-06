package com.emc.training.methodReferences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtility {

	private Map<Integer,Employee> list = new HashMap<Integer,Employee>();
	
	public EmployeeUtility(){
		super();
		list.put(101, new Employee(101,"a","a1"));
		list.put(102, new Employee(102,"b","b1"));
		list.put(103, new Employee(103,"c","c1"));
		list.put(104, new Employee(105,"c","a1"));
		list.put(105, new Employee(105,"c","a1"));
	}
	
	public Employee findEmployee(int id){
		return list.get(id);
	}
	
	public List<Employee> getAllEmployees(){
		return new ArrayList<Employee>(list.values());
	}
}

