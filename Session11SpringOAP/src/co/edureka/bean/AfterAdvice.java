package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object obj1, Method method, Object[] objArr, Object obj2) throws Throwable {
		// TODO Auto-generated method stub
		
	System.out.println("After Excecuted");
		
		System.out.println("Method: "+method.getName());
		for(Object o: objArr) {
			System.out.println(o);
		}
		System.out.println("obj is "+obj1);
		System.out.println("Ojb2 is "+obj2);
		System.out.println("After excecuttion finish");
		
	}

}
