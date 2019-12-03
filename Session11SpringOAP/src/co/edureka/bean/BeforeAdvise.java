package co.edureka.bean;

import java.lang.reflect.*;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvise implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before Excecuted");
		
		System.out.println("Method: "+method.getName());
		for(Object o: objArr) {
			System.out.println(o);
		}
		System.out.println("obj is "+obj);
		System.out.println("before excecuttion finish");
		
	}

}
