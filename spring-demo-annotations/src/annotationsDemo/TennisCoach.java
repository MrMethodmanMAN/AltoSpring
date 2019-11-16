package annotationsDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
	
	//define my init method 
	
	@PostConstruct
	public void sampleMethod() {
		System.out.println(" sampleMethod startup method post construct");
		
		//this.fortuneService = fortuneService;
		System.out.println("calling random forutne method");
		this.fortuneService.getFortune();
	}
	
	@PreDestroy
	public void samplePreMethod() {
		System.out.println(" sampleMethod finishup method post construct");
		//this.fortuneService = fortuneService;
	}
	
	/*
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
