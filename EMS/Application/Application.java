package Application;

import Employee.Employee;
import Manager.Manager;

public class Application{

	public static void main(String args[]) {

		Employee e = new Employee();
		e.print();
		
		Manager m = new Manager();
		m.print();
	}

}