package com.cy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cy.demo4.Car1;
import com.cy.demo4.Person;
import com.cy.demo4.User;

public class Demo4Test {

	//提交到了github上了吗？？？？？、
	
	@Test
	public void run1() {
		// 创建工厂，加载配置文件，CustomerDaoImpl创建了，CustomerServiceImpl创建了
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car1 c1 = (Car1) ac.getBean("car1");
		System.out.println(c1);
	}
	
	@Test
	public void run2() {
		// 创建工厂，加载配置文件，CustomerDaoImpl创建了，CustomerServiceImpl创建了
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}
	
	/**
	 * 测试注入集合
	 */
	@Test
	public void run3() {
		// 创建工厂，加载配置文件，CustomerDaoImpl创建了，CustomerServiceImpl创建了
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
}
