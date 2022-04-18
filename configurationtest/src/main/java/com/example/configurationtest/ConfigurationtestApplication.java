package com.example.configurationtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationtestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConfigurationtestApplication.class, args);

		// 아래와 같이 Mall 객체를 가져와서 사용하고싶을때..
		// 선언하는곳에선 어떻게 해야할까?
		// 방법 1. Mall.java객체를 생성한다음에 @Component어노테이션 붙여주면, getBean으로 객체가져올수있다.
		// 방법 2. 그냥 .Java파일에 객체만들고 @Configuration 으로 선언해준 클래스 안에서 @Bean객체로 만들어주면,
		// getBean으로 객체가져올수있다.
		//

		// User user = context.getBean(User.class);
		Mall mall = context.getBean(Mall.class);

		System.out.println(mall.getUser().getName());

	}

}
