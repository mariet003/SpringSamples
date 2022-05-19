package org.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Square obj=(Square) context.getBean("squarealias");
		
		obj.draw();
		
		Point random=new Point();
		random.setX(1);
		random.setY(1);
		
		obj.setA(random);
		
		//Because the default scope is a singleton, when we call the getBean again,
		//the above done change will be reflected in the object.
		//change the scope of the bean to prototype to see the difference.
		
		
		obj=(Square) context.getBean("squarealias");
		
		obj.draw();

	}

}
