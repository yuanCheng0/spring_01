package com.cy.demo4;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * 演示集合注入方式
 * @author 成圆
 *
 */
public class User {
	
	private String[] arrs;
	private List<Object> list;
	
	private Properties pro;
	
	

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "User [arrs=" + Arrays.toString(arrs) + ", list=" + list + ", pro=" + pro + "]";
	}
	
}
