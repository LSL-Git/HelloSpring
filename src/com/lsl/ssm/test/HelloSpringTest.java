package com.lsl.ssm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lsl.ssm.service.Dialogue;
import com.lsl.ssm.springdemo.Demo;
import com.lsl.ssm.springdemo.HelloSpring;

public class HelloSpringTest {

	@Test
	public void HelloSpring() {
		// 通过ClassPathXmlApplicationContext实例化Spring上下文
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 通过ApplicationContext的getBean()方法,根据id来获取bean的实例
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		// 执行print()方法
		helloSpring.print();
	}
	
	@Test
	public void sayTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Dialogue laoZiSay = (Dialogue) context.getBean("laoZiSay");
		
		laoZiSay.Say();
		
		Dialogue kongZiSay = (Dialogue) context.getBean("kongZiSay");
		
		kongZiSay.Say();
	}
	
	@Test
	public void demoSay() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo zgSay = (Demo) context.getBean("zgSay");
		
		zgSay.say();
		
		Demo rodSay = (Demo) context.getBean("rodSay");
		
		rodSay.say();
	}
}
