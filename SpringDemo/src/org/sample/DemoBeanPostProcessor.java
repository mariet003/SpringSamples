package org.sample;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object bean,String beanName)
	{
		System.out.println("Initialized "+beanName);
		return bean;
	}
	
	
	
	

}
