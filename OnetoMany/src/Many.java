import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Many {


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
		Certification c1=new Certification(0,"ccna");
		Certification c2=new Certification(0,"OCJP");
		Certification c3=new Certification(0,"AWS");
		
		List<Certification> cList1=new ArrayList<>();
		cList1.add(c1);
		cList1.add(c2);
		cList1.add(c3);
		
		List<Certification> cList2=new ArrayList<>();
		cList2.add(c1);
		cList2.add(c2);
		
		Manager mgr1=new Manager();
		mgr1.setName("John");
		mgr1.setEmail("john@gmail.com");
		mgr1.setClist(cList1);
		
		Manager mgr2=new Manager();
		mgr2.setName("Johny");
		mgr2.setEmail("johny@gmail.com");
		mgr2.setClist(cList2);
		
	    try{
		Transaction tnx = session.beginTransaction();
	
	
	
		
		
	
		session.save(mgr1);
		session.save(mgr2);
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
