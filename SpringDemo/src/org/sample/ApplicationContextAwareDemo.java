package org.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		context.registerShutdownHook();
		Rectangle obj=(Rectangle) context.getBean("rect");
		obj.drawRectangle();
		
		//Check the Rectangle class to see the usage of ApplicationContextDemo

	}

}
