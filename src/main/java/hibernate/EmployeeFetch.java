package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFetch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		
		Employee employee=manager.find(Employee.class, 4);
		if (employee!=null) {
			System.out.println(employee);
		}
		else
		{
			System.out.println("ID not found");
		}
	}

}
