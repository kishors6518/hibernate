package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Employee employee=manager.find(Employee.class, 100);
		if(employee!=null)
		{
			transaction.begin();
			manager.remove(employee);
			transaction.commit();
		}
		else
		{
			System.out.println("ID not found");
		}
	}

}
