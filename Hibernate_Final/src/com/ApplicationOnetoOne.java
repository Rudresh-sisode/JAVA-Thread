package com;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ApplicationOnetoOne {

	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int choice=0;
		boolean repeatOn=true;
		while(repeatOn){
			System.out.println("Enter your choice to perform actions on Employee database : 1-Add/n ,2-Get by id, 3-Update by id, 4-Remove by id, 5-HQL, 6-GetAllEmployees,7-CritrtiaQueries");
			choice = s.nextInt();
		switch(choice){
		case 1: addEmployee();
		        break;
		
		default: System.out.println("Exiting....Bye");
				 repeatOn=false;
		}
		}
	}
	    
	public static void addEmployee(){
	
		SessionFactory sessionfactory =  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionfactory.openSession();
	    try{
		Transaction tnx = session.beginTransaction();
		//Employee e1=new Employee(); 
		Person person=new Person();
		person.setName("SohameRajput");
		person.setAge(13);
		person.setEmail("sohamerajput@gmail.com");
		
		Address address=new Address();
		address.setAdrsLine("Contry home");
		address.setCity("Banglore");
		address.setState("Maharastra");
		address.setZipCode(424206);
		person.setAdrs(address);
		address.setPerson(person);
		
		
		
		//e1.setFname("Mr. mate");
		//e1.setLname("sosode");
		//e1.setDesignation("software developer");
		//Date d = java.sql.Date.valueOf("1987-11-15");
		//e1.setDob(d);
		//e1.setDoj(java.sql.Date.valueOf("2017-08-01"));
		session.save(person);
		tnx.commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			session.close();
			System.out.println("Successfully saved....");
		}
	  }
}
