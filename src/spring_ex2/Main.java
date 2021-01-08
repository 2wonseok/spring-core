package spring_ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_ex2/context.xml");
		
//		Tire tire = new Tire();
//		Car car = new Car(tire);
		
		Object b1 = context.getBean("tire");
		System.out.println(b1);
		
		Object b2 = context.getBean("car");
		System.out.println(b2);
		
		Car c1 = (Car) b2;
		System.out.println(c1.getTire());
	}
}
