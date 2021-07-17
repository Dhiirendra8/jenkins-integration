package com.spingboot.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOPAdvice {
	
	
	@Around("@annotation(com.spingboot.aop.advice.MyAnnotation)")	
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("# ...Before Advice");
		Object object = pjp.proceed();
		
		System.out.println("After Advice ... #");
		
		return object;
		
	}
}
