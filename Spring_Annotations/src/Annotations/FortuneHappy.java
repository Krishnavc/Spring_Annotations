package Annotations;

import org.springframework.stereotype.Component;

@Component
public class FortuneHappy implements FortuneService {

	@Override
	public String getFortune() {
		// 

		return "Hey!! Lucky Day!!" ;
	}

}
