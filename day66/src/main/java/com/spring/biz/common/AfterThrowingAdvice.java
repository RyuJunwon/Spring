package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


public class AfterThrowingAdvice {
	
	//@Pointcut("execution(* com.spring.biz..*Impl.*(..))")
	public void aPointcut() {}
	
	//@After("aPointcut()")
	public void afterThrowingPrintLog(JoinPoint jp, Exception exceptObj) {
		String methodName = jp.getSignature().getName();
		
		System.out.println("횡단 관심 : " + methodName + "에서 예외가 발생해서 출력되는 로그");
		System.out.println("예외 메시지: " + exceptObj.getMessage());
	}
}
