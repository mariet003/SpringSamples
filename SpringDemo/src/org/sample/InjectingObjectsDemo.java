package org.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Square obj=(Square) context.getBean("square");
		
		obj.draw();

	}

}
