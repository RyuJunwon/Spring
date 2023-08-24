package day59;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sTV") // 여기서 new 된 것
public class SamsungTV implements TV {
	
	@Autowired // 자료형이 같은 애로 remote를 의존 주입(DI) 해줘
	private Remote remote;
	
	
	@Override
	public void funcA() {
		remote.funcA();
		System.out.println("SamsungTV 전원 ON/OFF");
	}	

	@Override
	public void funcB() {
		remote.funcB();
		System.out.println("SamsungTV 채널 변경");
	}

}

//1. 의존 관계가 발생
	// **** 2. 의존 주입(DI) ****
	// 1) 생성자 주입
	// 2) setter 주입
	// 3. 설정(.xml)
	// 		: POJO -> 스프링 컨테이너에서 설정
	// 만약, not POJO(서블릿) 이었다면 서블릿 컨테이너(톰캣)에서 설정