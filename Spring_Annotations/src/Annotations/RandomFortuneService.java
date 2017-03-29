package Annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	private String[] data = {
			"Diligence is the mother of good luck",
			"The Journey is the reward",
			"I love you Maaa:)"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
