package org.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      BeanDemo obj = (BeanDemo) context.getBean("beanDemo");
	      obj.getMessage();
	      ((ClassPathXmlApplicationContext)context).close();
	      
	}

}
