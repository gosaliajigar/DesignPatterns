package com.composite.design.processor;

import com.composite.design.part.Employee;

/**
 * Composite Design Patter Main Processor to print tree hierarchy
 * 
 * @author "Jigar Gosalia"
 *
 */
public class MainProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee cto = new Employee("Joey", "Cheif Technical Officer", 100000);

		Employee seniorDirector = new Employee("Chandler", "Senior Director", 100000);
		
		Employee director = new Employee("Ross", "Director", 80000);
		
		Employee manager = new Employee("Racheal", "Manager", 50000);

		Employee leadDeveloper = new Employee("Phoebe", "Lead Developer", 30000);
		Employee architecture = new Employee("Monica", "Architecture", 30000);

		Employee developer = new Employee("Richard", "Developer", 10000);
		Employee tester = new Employee("Janice", "Tester", 10000);

		cto.addSubordinate(seniorDirector);

		seniorDirector.addSubordinate(director);

		director.addSubordinate(manager);

		manager.addSubordinate(leadDeveloper);
		manager.addSubordinate(architecture);

		leadDeveloper.addSubordinate(developer);
		leadDeveloper.addSubordinate(tester);

		// Print Employee Tree
		getEmployeeTree(cto, "");
	}

	private static void getEmployeeTree(Employee head, String tabs) {
		tabs += "-";
		for (Employee employee : head.getSubordinates()) {
			System.out.println(tabs + employee);
			getEmployeeTree(employee, tabs);
		}
	}
}