package Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args){
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}
}

