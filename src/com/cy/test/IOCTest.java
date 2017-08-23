package com.cy.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cy.service.UserService;
import com.cy.serviceImpl.CustomerDaoImpl;
import com.cy.serviceImpl.CustomerServiceImpl;
import com.cy.serviceImpl.UserServiceImpl;

/**
 * 测试IOC的程序
 * @author 成圆
 *
 */
public class IOCTest {
	/**
	 * 原来的方式
	 */
	@Test
	public void run1() {
		//创建实现类
		UserServiceImpl usi = new UserServiceImpl();
		usi.setName("美美");
		usi.sayHello();
	}
	
	//使用的是spring框架的方式
	@Test
	public void run2() {
		//创建工厂，加载核心配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从工厂中获取到对象
		UserService usi = (UserService) ac.getBean("userService");
		//调用对象的方法执行
		usi.sayHello();
	}
	
	/**
	 * 老的工厂版本BeanFactory
	 */
	@Test
	public void run3() {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		UserService us = (UserService) factory.getBean("userService");
		us.sayHello();
	}
	
	/**
	 * 演示销毁的方法
	 */
	@Test
	public void run4() {
		//创建工厂，加载核心配置文件
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从工厂中获取到对象
		UserService usi = (UserService) ac.getBean("userService");
		//调用对象的方法执行
		usi.sayHello();
		
		//关闭工厂，工厂都关闭，对象都会被销毁
		ac.close();
	}
	
	/**
	 * 依赖注入概念的解释
	 */
	@Test
	public void run5() {
		//创建工厂，加载核心配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从工厂中获取到对象
		UserService usi = (UserService) ac.getBean("userService");
		//调用对象的方法执行
		usi.sayHello();
	}
	
	/**============================================
	 * 依赖注入Demo
	 */
	@Test
	public void run6() {
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		customerServiceImpl.save();
	}
	
	/**
	 * Spring方式
	 */
	@Test
	public void run7() {
		//创建工厂，加载配置文件，CustomerDaoImpl创建了，CustomerServiceImpl创建了
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerServiceImpl customerServiceImpl = (CustomerServiceImpl) ac.getBean("customerService");
		customerServiceImpl.save();
	}
	
}
