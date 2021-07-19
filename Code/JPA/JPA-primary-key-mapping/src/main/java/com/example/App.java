package com.example;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		
		Employee employee = new Employee();
		
		EmployeeID employeeID=new EmployeeID();
		employeeID.empId=1;
		employeeID.depId=11;
		
		employee.employeeID=employeeID;
		
		employee.name="Nag";
		employee.gender=Gender.MALE; 
		employee.dob=new Date();
		employee.empProfile="bla bla bla";
				
				
		

		// Using JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
		em.persist(employee);
		
		
		em.getTransaction().commit();
		em.close();
	}

}
