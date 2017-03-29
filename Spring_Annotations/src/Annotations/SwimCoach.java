package Annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

		private FortuneService fortuneService;

		@Value("${krishna.email}")
		private String email;

		@Value("${krishna.team}")
		private String team;
		
		
		public String getEmail() {
			return email;
		}

		public String getTeam() {
			return team;
		}

		public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		}

		@Override
		public String getDailyWorkout() {
			return "Swim Swim Swim!!!";
		}

		@Override
		public String getDailyFortune() {
			return fortuneService.getFortune();
		}
}
