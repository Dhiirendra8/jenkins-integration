package com.spingboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.spingboot.aop.advice.MyAnnotation;
import com.spingboot.aop.advice.MyService;

@SpringBootApplication
@Component
public class DemoApplication {

//	@Autowired 
	 MyService service = new MyService();
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DemoApplication demoApplication = new DemoApplication();
		demoApplication.medhod();
	}
	
	
	@MyAnnotation
	public void medhod() {
		System.out.println("This is method log");
		service.ServiceMethod();
		
		System.out.println("Not working");
	}

}
