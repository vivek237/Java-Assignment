package com.example.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application1.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);
	}
}
