package co.edureka.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.User;



public class Application {
	public static void main(String[] arvs) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		
		User user=context.getBean("userBeanProxy",User.class);
		user.loginUser("admine@gmail.com","passok");
	}


	

}
