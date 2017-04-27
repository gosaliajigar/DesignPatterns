package structural.composite.design.pattern.part;

import java.util.ArrayList;
import java.util.List;

/**
 * POJO for Composite Design Pattern, which will represent part as a whole
 * 
 * @author "Jigar Gosalia"
 *
 */
public class Employee {

	private String name;

	private String department;

	private int salary;

	private List<Employee> subordinates;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void addSubordinate(Employee employee) {
		subordinates.add(employee);
	}

	public void removeSubordinate(Employee employee) {
		subordinates.remove(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + department + ", salary :" + salary + " ]");
	}
}