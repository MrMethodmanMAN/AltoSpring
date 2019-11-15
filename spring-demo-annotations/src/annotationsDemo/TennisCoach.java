package annotationsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach 
{
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("calling tennisCoach");
	}
	/*
	@Autowired
	public void sampleMethod(FortuneService fortuneService) {
		System.out.println(" sampleMethod");
		this.fortuneService = fortuneService;
	}
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(("setter method tennis coach"));
		this.fortuneService = fortuneService;
	}
	*/
	/*
	// create a constructor 
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}	
	*/
	@Override
	public String getDailyWorkout() 
	{		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
