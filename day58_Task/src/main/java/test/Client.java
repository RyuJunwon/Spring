package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
				
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		Champion champ = (Champion)factory.getBean("ahri");
		Champion champ2 = (Champion)factory.getBean("teemo");
		champ.use();
		champ.q();
		champ2.q();
		champ.w();
		champ2.w();
		champ.e();
		champ2.e();
		champ.r();
		champ2.use();
		champ2.r();
	}
}
