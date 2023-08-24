package day59;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		// 스프링 컨테이너(★)가 동작할 수 있도록 해야함
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// 1. 스프링 컨테이너 구동
		// 		ㄴ> 팩토리 패턴을 사용하고 있어서, 객체명을 LookUp하여 객체 반환이 가능하다
		
		TV tv = (TV)factory.getBean("lTV");
		tv.funcA();
		tv.funcB();
		
//		TestBean tb = (TestBean)factory.getBean("tb");
//		List<String> list = tb.getTestList();
//		for(String v:list) {
//			System.out.println(v);
//		}
		factory.close();
	}
}
