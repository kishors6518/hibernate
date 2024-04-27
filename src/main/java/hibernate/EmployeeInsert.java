package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(100);
		employee.setName("Aniket");
		employee.setPhone(8845785869l);
		employee.setAddress("Latur");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
}
