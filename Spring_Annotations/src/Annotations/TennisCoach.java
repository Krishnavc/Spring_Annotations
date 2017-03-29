package Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//default constructor
		public TennisCoach(){
			System.out.println(">> TennisCoach: inside default constructor");
		}
		
		// Define my init method
		@PostConstruct
		public void doMyStartupStuff() {
		System.out.println(">> TennisCoach : inside of doMyStartupStuff()");
		}

		// Define my destroy method
		@PreDestroy
		public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach : inside of doMyCleanupStuff()");
		}
	
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
		
	}*/
	
	

	//define a setter method
	/*@Autowired
	public void DoCrazyThings(FortuneService theFortuneService){
		System.out.println("TennisCoach : Inside doCrazyThings() method");
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		
		return "Hey ! Exercise keeps you healthy!!";
	}
	
	@Override
	public String getDailyFortune(){
		return fortuneService.getFortune();
	}

}

//("thatSillyCoach")