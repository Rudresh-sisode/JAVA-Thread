package com.javatpoint;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
HibernateTemplate template;

public void setSessionFactory(SessionFactory factory) {
	template=new HibernateTemplate(factory);
}

public void saveEmployee(Employee e){
	template.save(e);
}
}
