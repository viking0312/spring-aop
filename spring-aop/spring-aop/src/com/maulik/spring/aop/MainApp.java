package com.maulik.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maulik.spring.aop.dao.AccontDAO;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccontDAO theAccountDAO = context.getBean("accontDAO", AccontDAO.class);
		
		theAccountDAO.addAccount();
		
		context.close();

	}

}
