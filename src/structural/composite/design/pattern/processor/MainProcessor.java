package structural.composite.design.pattern.processor;

import structural.composite.design.pattern.part.Employee;

/**
 * Composite Design Pattern : Structural Design Pattern<br>
 * <br>
 * Build a complex object out of elemental objects and itself like a tree
 * structure. Represent a part-whole relationship like tree folder system. Group
 * components to form larger components, which in turn can be grouped to form
 * still larger components.
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
		System.out.println("Employee # : " + getEmployeeTree(cto, ""));
	}

	/**
	 * @param head
	 * @param tabs
	 */
	private static int getEmployeeTree(Employee head, String tabs) {
		int count = 0;
		tabs += "-";
		for (Employee employee : head.getSubordinates()) {
			System.out.println(tabs + employee);
			count++;
			count += getEmployeeTree(employee, tabs);
		}
		return count;
	}
}