package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//get the bean from the container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
	
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//printout the result
		System.out.println("\n pointing out to the same object: " + result);
		
		System.out.println("\n memory location for theCoach: " + theCoach);
		
		System.out.println("\n memory location for alphaCoach: " + alphaCoach + "\n");
	
		//Close the context
		context.close();
	}
	
	
	

}
