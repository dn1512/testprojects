package com.exce.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @Classname TestBean
 * @Discription TODO
 * @date 2020/6/2 1:36
 * @Created by liutengjun
 */
public class TestBean implements InitializingBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printSomeThing(){
		System.out.println("我就是随便输出的");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	public void initTestBean(){
		System.out.println("创建TestBean");
	}
}
