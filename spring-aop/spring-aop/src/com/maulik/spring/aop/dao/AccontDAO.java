package com.maulik.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccontDAO {
	
	public void addAccount() {
		
		System.out.println(getClass() + " Adding account, your majesty!!");
		
	}

}
