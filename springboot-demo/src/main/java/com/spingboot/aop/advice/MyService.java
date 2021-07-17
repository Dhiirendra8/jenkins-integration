package com.spingboot.aop.advice;

import org.springframework.stereotype.Service;

@Service
public class MyService {

		@MyAnnotation
		public void ServiceMethod() {
			System.out.println("Service Called ......");
		}
}
