package assignment12.session2.Assignment12_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		//using ClassPathXmlApplicationContext to get the beans
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		HelloSpring hw = (HelloSpring) appContext.getBean("hello");
		//getting value from context
		String output = hw.getValueFromContext("strHello");
		System.out.print(output);
				
	}
}