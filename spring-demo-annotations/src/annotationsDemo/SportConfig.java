package annotationsDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("annotationsDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig 
{
	// 1. define bean for sadfortune service 
	
	@Bean 
	public FortuneService sadFortuneService()
	{
		//the method name will be the spring ID when assigning ot the container

		return new SadFortuneService();
	}
	// 2. define service for swim coach and inject dependencies
	
	@Bean
	public Coach swimCoach()
	{
		// bean is being called aboce and inject here
		return new SwimCoach(sadFortuneService());
	}
	
}
