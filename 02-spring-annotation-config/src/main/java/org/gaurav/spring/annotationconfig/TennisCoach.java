package org.gaurav.spring.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	public String getDailyWorkout() {
		return "Practice back-hand volley for 20 minutes.";
	}

}
