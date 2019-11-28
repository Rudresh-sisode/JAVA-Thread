package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Employee;

/*
 * Hibernate Procedure
 * Pre req: Link hiber jar files
1. create a java class for business object which will contain data
2.create a java class with main method
3.copy hibernate.cfg.xml file and edit it.
4 copy anyname.hbm.xml file and map business object to the table 
5.write hibernate api to perform crud operation in main method.
 */
public class Application {

	public static void main(String[] args) {
	
		Employee emp1=new Employee();
		emp1.setName("John");
		emp1.setEmail("johnthon@gmail.com");
		emp1.setAge(32);
		emp1.setAddress("New your Continent");
		
		Employee emp2=new Employee(null,"Marco","marco@gmail.com",32,"new your");
		
		System.out.println(emp1);
		System.out.println(emp2);
		//we shall persist the data using hibernate API
		//four api declared here.
		Configuration config =null;
		SessionFactory factory=null;
		Session session=null;
		Transaction transaction=null;
		
		try
		{
			config =new Configuration();
			config.configure();//read hibernate.cfg.xml file
			
			factory=config.buildSessionFactory();
			
			session=factory.openSession();//creating connection with DB
			
			transaction =session.beginTransaction();
			
			session.save(emp1);
			session.save(emp2);
			transaction.commit();
			
			System.out.println("=--transaction finish---=");
			
		}
		catch(Exception ex)
		{
			System.out.println("Boss exception occured "+ex);
			ex.getStackTrace();
			transaction.rollback();
		}
		finally {
			if(session!=null)
				session.close();
			if(factory!=null)
				factory.close();
			
		}
		
		

	}

}
