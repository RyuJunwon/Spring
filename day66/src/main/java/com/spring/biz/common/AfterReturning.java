package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.spring.biz.member.MemberVO;


public class AfterReturning {
	
	//@Pointcut("execution(* com.spring.biz..*Impl.select*(..))")
	public void bPointcut() {}
	
	//@After("bPointcut()")
	public void afterReturningPrintLog(JoinPoint jp, Object returnObj) {
		String methodName = jp.getSignature().getName();
		System.out.println("횡단 관심: "+ methodName +" 비즈니스 메소드의 반환 이후의 로그");

		//returnObj가 관리자라면, 로그에 [관리자 입장] 이라고 출력하고 싶음
		if(returnObj instanceof MemberVO) {
			MemberVO mVO = (MemberVO)returnObj; // 다운캐스팅
			if(mVO.getRole().equals("ADMIN")) {
				System.out.println("[ 관리자 입장 ]");
			}
			else {
				System.out.println("[ 사용자 입장 ]");
			} 
		}
		else {
			System.out.println(" [ 데이터 열람 ]");
		}
	}
}
