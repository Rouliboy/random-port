package com.jvi.random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomPortApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext( "application-context.xml" );

		RandomPortGenerator rpg1 = ctx.getBean(RandomPortGenerator.class);
		System.out.println(rpg1.generatePortInRange(1,2));
		System.out.println(rpg1.generatePortInRange("3-5"));

		ServiceEngine serviceEngine = (ServiceEngine) ctx.getBean("serviceEngine");
		System.out.println(serviceEngine.getName());
		System.out.println(serviceEngine.getServicePort());


	}

}
