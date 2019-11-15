package annotationsDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{
	public static void main(String[] args)
	{
		// read the spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from teh spring container 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call the method in the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		// close the context 
		context.close();
	}
	
	
	
}
