package com.emc.training.streaming;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class PartitionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility=new EmployeeUtility();
		
	Map<Boolean, List<Employee>> employeeGroups=
				utility.getAllEmployees().stream()
				.collect(Collectors.partitioningBy(e->e.getDesignation().equals("Developer")));
		
		List<Employee> developers=employeeGroups.get(true);
		System.out.println("List of Developers");
		developers.forEach(System.out::println);
		System.out.println("List of Non Developers");
		employeeGroups.get(false).forEach(System.out::println);
	}

}
