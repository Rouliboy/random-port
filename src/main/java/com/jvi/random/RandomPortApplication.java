package com.jvi.random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomPortApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext( "application-context.xml" );

		ServiceEngine serviceEngine = (ServiceEngine) ctx.getBean("serviceEngine");
		System.out.println(serviceEngine.getName());

		ServiceEngine serviceEngine2 = (ServiceEngine) ctx.getBean("serviceEngine2");
		System.out.println(serviceEngine2.getServicePort());

		ServiceEngine serviceEngine3 = (ServiceEngine) ctx.getBean("serviceEngine3");
		System.out.println(serviceEngine3.getServicePort());
	}

}
