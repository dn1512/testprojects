package com.exce.config;

import com.exce.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyConfig
 * @Discription TODO
 * @date 2020/6/2 2:19
 * @Created by liutengjun
 */
@Configuration
@ComponentScan(basePackages = {"com.exce.bean"})
public class MyConfig {

	@Bean(initMethod = "initTestBean")
	public TestBean testBean(){
		TestBean testBean = new TestBean();
		testBean.setName("瞎扯");
		return testBean;
	}
}
