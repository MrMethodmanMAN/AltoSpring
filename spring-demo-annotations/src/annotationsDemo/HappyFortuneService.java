package annotationsDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService 
{

	
	public String getFortune() 
	{
		return "Today is a good day for two ..";
	}

}
