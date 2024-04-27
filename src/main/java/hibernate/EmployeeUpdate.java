package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {

	public static void main(String[] args) {
//		Employee employee=new Employee();
//		employee.setId(10);
//		employee.setName("Kishor");
//		employee.setPhone(9503018558l);
//		employee.setAddress("Shaniwar Peth");
//		
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
//		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
//		
//		Employee  employee2= manager.find(Employee.class, employee.getId());
//		if(employee2!=null)
//		{
//			transaction.begin();
//			manager.merge(employee2);
//			transaction.commit();
//		}
//		else
//		{
//			System.out.println("ID not found");
//		}
		
		
		
		//To Update Specific Data
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		
		Employee employee=manager.find(Employee.class, 1);
		if(employee!=null)
		{
			employee.setAddress("Mumbai");
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.merge(employee);
			transaction.commit();
		}
		else
		{
			System.out.println("ID not found");
		}
		
		
		
		
		
		
		

	}

}
