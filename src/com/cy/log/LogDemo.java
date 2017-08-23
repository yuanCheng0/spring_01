package com.cy.log;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 演示日志用法
 * @author 成圆
 *
 */
public class LogDemo {
	
	//创建日志对象
	private Logger log = Logger.getLogger(LogDemo.class);
	
	@Test
	public void run1() {
		System.out.println("执行了。。。。");
		log.info("执行了....");
	}
}
