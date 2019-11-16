package annotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp 
{
	public static void main(String[] args)
	{
		// read the sportConfig
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container - this instance from the java
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call the method in the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		//call the new swim methods 
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
		
		// close the context 
		context.close();
	}
	
	
	
}
