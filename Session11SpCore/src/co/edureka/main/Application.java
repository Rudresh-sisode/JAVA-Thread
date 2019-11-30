package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Address;
import co.edureka.model.CB;
import co.edureka.model.Father;
import co.edureka.model.Person;
import co.edureka.model.Son;
import co.edureka.model.Student;

public class Application {

	public static void main(String... arvs) {
		//object construction
		Student s1=new Student(101,"john",32,"john@gmail.com","New york continent");
		
		Student s2=new Student();
		
		s2.setRoll(101);
		s2.setName("Rudresh");
		s2.setAge(32);
		s2.setEmail("Jennie@example.com");
		s2.setAddress("Contry Homes");
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		//Spring FW | Core layer
		//inversion of control IOC -: do not create objects, objects will created auto, by the system.
		//you will have reference to the contructed object.
		//lifecycle of the object also managed by the system.
		//system means IOC container, this will create object for you.
		/*
		 * It will look for construction and destruction of object for us
		 * we configure the data for an object in an xml file and ioc container parses the same 
		 * for object
		 * There are two container
		 * IOC container: beanFactory
		 * IOC container applicationContext
		 * 1.link the spring core jar
		 * 2.congigure the data for object in an xml file
		 * 3.in client class with main method, use beanfactory api
		 */
		
		/*Resource resource=new ClassPathResource("context.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		//requesting the access for the reference 
		//Bean factory is constructing object using default construtor and setter method.
		Student sRef=factory.getBean("s3",Student.class);
		System.out.println("Student details :"+sRef);
		*/
		//IOC container
		//System.out.println("IOC container");
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		/*Student sRef2=(Student)context.getBean("s3");
		System.out.println(sRef2);*/
		/*
		ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
		cxt.close();*/
		
	/*	Father f=context.getBean("f3",Father.class);
		Son s=context.getBean("sRef",Son.class);
		System.out.println(s);
		System.out.println(f);*/
		
		/*Person pRef=new Person();
		Address aRef=new Address();
		pRef.setAddress(aRef);
		
		Person pRef1=new Person(aRef);*/
		/*
		Person p=context.getBean("pRef",Person.class);
		System.out.println(p);
		System.out.println("certificates "+ p.getCertificates());
		*/
		CB cRef=context.getBean("cb",CB.class);
		cRef.getCa().sayHello("rudresh");
		
		
	}
	
	
	
}
