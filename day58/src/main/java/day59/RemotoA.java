package day59;

import org.springframework.stereotype.Component;

@Component
public class RemotoA implements Remote {
	
	@Override
	public void funcA() {
		System.out.println("리모컨A");
		
	}

	@Override
	public void funcB() {
		System.out.println("리모컨A");
	}

}
