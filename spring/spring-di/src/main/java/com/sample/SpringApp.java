package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		// 스프링 컨테이너 생성하기
		String resource = "context.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(resource);
		
		// 스프링 컨테이너에서 객체 찾아서 사용하기
		// Hello객체 꺼내기(Dependency Lookpup)
		Hello hello = container.getBean("h", Hello.class);
		hello.sayHello();
	}
}
