package com.cy.serviceImpl;

import com.cy.service.UserService;

public class UserServiceImpl implements UserService {

	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		
		System.out.println("hello spring 。。。"+name);

	}

	public void init() {
		System.out.println("初始化。。。");
	}
	
	public void destory() {
		System.out.println("销毁了。。。");
	}
}
