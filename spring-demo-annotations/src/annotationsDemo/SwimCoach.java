package annotationsDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach 
{
	
	private FortuneService fortuneService; 
	
	@Value("${foo.email}")
	private String email;
	

	@Value("{foo.team}")
	private String team;
	
	
	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}

	
	public SwimCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService; 
	}

	
	@Override
	public String getDailyWorkout() 
	{
		return "Swim a number of laps today";
	}

	@Override
	public String getDailyFortune() 
	{
		
		return fortuneService.getFortune();
	}

}
