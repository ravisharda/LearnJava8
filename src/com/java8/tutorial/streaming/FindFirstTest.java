package com.java8.tutorial.streaming;

import java.util.Optional;
import java.util.stream.Stream;

import com.java8.tutorial.methodReferences.Employee;
import com.java8.tutorial.methodReferences.EmployeeUtility;

public class FindFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility = new EmployeeUtility();
		Stream<Employee> stream = utility.getAllEmployees().stream();
		Optional<Employee> opt = stream.filter(e->e.getName().equals("abhi")).findFirst();
		if(opt.isPresent()){
			System.out.println(opt.get());
		}
		else{
			System.out.println("NO such Employee");
		}
	}

}
