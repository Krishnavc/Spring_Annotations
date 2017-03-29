package Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("Annotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// Define bean for our Funny Fortune Service
	@Bean
	public FortuneService FunnyFortuneService(){
		return new FunnyFortuneService();
	}
	
	//Define bean for our swim coach and inject dependency
	@Bean
	public Coach SwimCoach(){
		return new SwimCoach(FunnyFortuneService());
	}
}
