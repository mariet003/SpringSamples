package org.sample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Rectangle implements ApplicationContextAware,InitializingBean, DisposableBean {
	
	
	ApplicationContext context;
	
	Point one;
	Point two;
	Point three;
	Point four;
	
	
	
	
	public Point getOne() {
		return one;
	}
	public void setOne(Point one) {
		this.one = one;
	}
	public Point getTwo() {
		return two;
	}
	public void setTwo(Point two) {
		this.two = two;
	}
	public Point getThree() {
		return three;
	}
	public void setThree(Point three) {
		this.three = three;
	}
	public Point getFour() {
		return four;
	}
	public void setFour(Point four) {
		this.four = four;
	}
	
	public void drawRectangle()
	{
		System.out.println("one= ("+one.getX()+","+one.getY()+")");
		System.out.println("two= ("+two.getX()+","+two.getY()+")");
		System.out.println("three= ("+three.getX()+","+three.getY()+")");
		System.out.println("four= ("+four.getX()+","+four.getY()+")");
		
		//Getting the square object using ApplicationContextAware.
		Square obj=(Square) context.getBean("square");
		obj.draw();
	}
	
	
	@Override
	public void setApplicationContext(ApplicationContext arg) throws BeansException {
		// TODO Auto-generated method stub
		
		context=arg;	
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Initializing bean method");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Disposable bean method");
		
	}
	
	public void myInit()
	{
		System.out.println("Myinit bean method");
	}
	
	public void cleanUp()
	{
		System.out.println("Cleanup bean method");
	}
	
	

}
