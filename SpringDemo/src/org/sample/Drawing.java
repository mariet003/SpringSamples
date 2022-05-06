package org.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        //Normal way of invoking an object using new operator.
		Triangle triangle1=new Triangle();
		triangle1.setType("Equilateral");
		triangle1.draw();
		
		
		//invoking an object using BeanFactory
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
		Triangle triangle2=(Triangle)factory.getBean("triangle");
		triangle2.draw();
		
		//invoking an object using ApplicationContext.While using this the spring.xml file has 
		//to be in the class path.
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle3=(Triangle) context.getBean("triangle");
		triangle3.draw();

	}

}
