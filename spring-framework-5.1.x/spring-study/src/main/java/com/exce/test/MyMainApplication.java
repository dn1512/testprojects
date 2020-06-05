package com.exce.test;

import com.exce.bean.TestBean;
import com.exce.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname MyMainApplication
 * @Discription TODO
 * @date 2020/6/2 1:32
 * @Created by liutengjun
 */
public class MyMainApplication {
	public static void main(String[] args){
		TestBean testBean = getBeanByClassPathXmlApplicationContext();
//		TestBean testBean = getBeanByAnnotationConfigApplicationContext();
		System.out.println(testBean.getName());
		testBean.printSomeThing();
	}

	static TestBean getBeanByClassPathXmlApplicationContext(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:test-spring-xmlconfig.xml");
		TestBean testBean = (TestBean) ac.getBean("testBean");
		return testBean;
	}

	static TestBean getBeanByAnnotationConfigApplicationContext(){
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		TestBean testBean = (TestBean) context.getBean("testBean");
		return testBean;
	}
}
