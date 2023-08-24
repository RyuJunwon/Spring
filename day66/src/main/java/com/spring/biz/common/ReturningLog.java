package com.spring.biz.common;

public class ReturningLog {
	
	//@Pointcut("execution(* com.spring.biz..*Impl.select*(..))")
	public void bPointcut() {}
	
	//@After("bPointcut()")
	public void returningPrintLog() {
		System.out.println("비즈니스 메소드 반환값 반환 후 호출됨");
	}
}
