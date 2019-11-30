package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
public static void main(String[] args) {
	
/*	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	*/
	ApplicationContext contex=new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDao dao=(EmployeeDao)contex.getBean("d");
	
	Employee e=new Employee();
	e.setId(12);
	e.setName("Pavas");
	e.setSalary(6000);
	
	dao.saveEmployee(e);
	System.out.println("Record inserted...");
	
}
}
