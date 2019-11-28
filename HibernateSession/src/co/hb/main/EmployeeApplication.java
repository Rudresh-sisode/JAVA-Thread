package co.hb.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.hb.model.Employee;

public class EmployeeApplication {

	public static void  main(String... arvs)
	{
		Employee emp1=new Employee();
		emp1.setName("John");
		emp1.setAge(32);
		emp1.setEmail("johanthon@gmail.com");
		emp1.setAddress("New your continent");
		
		Employee emp2=new Employee(null,"Marco","marco@gmail.com",32,"new your");
		System.out.println(emp1);
		System.out.println(emp2);
		
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
