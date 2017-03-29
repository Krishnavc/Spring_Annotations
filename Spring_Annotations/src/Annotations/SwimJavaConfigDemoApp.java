package Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args){
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		SwimCoach theCoach = context.getBean("SwimCoach", SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Call our new swim coach methods ... has the props values injected
		System.out.println("email : " + theCoach.getEmail());
		System.out.println("team : " + theCoach.getTeam());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();
	}
}

