package assignment6_beanScopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach 
{

	@Autowired
	private FortuneTelling fortuneTelling;
	
	
	@Override
	public String doExercise() 
	{
		
		return "practice your backhand";
	}

	public String getFortune() 
	{		
		return fortuneTelling.getFortune();
	}

}
