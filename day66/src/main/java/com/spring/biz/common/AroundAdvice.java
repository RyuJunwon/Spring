package com.spring.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;


public class AroundAdvice {	// around 메소드
	
	//@Pointcut("execution(* com.spring.biz..*Impl.select*(..))")
	public void bPointcut() {}
	
	//@After("bPointcut()")
	public Object aroundPrintLog(ProceedingJoinPoint pjp) throws Throwable  {
		System.out.println("around 로그 전");
		
		StopWatch sw = new StopWatch();
		
		Object obj = pjp.proceed(); // 비즈니스 메소드 수행
		// 여기쯤 외부의 비즈니스 메소드를 호출함
		

		// 끝 ! [ 성능 테스트를 위한 코드 ]
		sw.stop();
		String methodName = pjp.getSignature().getName();
		System.out.println(methodName + "메소드를 수행하는데 소요한 시간은 " + sw.getTotalTimeMillis()  + "초 입니다.");
		
		System.out.println("around 로그 후");
	
		return obj;
	}
}
