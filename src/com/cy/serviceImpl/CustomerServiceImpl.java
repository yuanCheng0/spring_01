package com.cy.serviceImpl;

public class CustomerServiceImpl {
	
	private CustomerDaoImpl customerDao;
	
	public void setCustomerDao(CustomerDaoImpl customerDao) {
		this.customerDao = customerDao;
	}

	public void save() {
		System.out.println("我是业务层service...");
		//原来的编写方式
		//new CustomerDaoImpl().save();
		
		//Spring的方式
		customerDao.save();
	}
}
