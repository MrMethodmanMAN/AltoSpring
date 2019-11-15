package annotationsDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp
{
	public static void main(String[] args)
	{
		// load the spring congi
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean from the spring container 
		Coach theCoach  = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check  if they are the same 
		boolean result = (theCoach == alphaCoach); 
		
		//print result 
		System.out.println("pointing to the same object : " + result);
		
		System.out.println("mem loation of tennisCoach : " +  theCoach);
		
		
		System.out.println("mem location of alphaCoach : " + alphaCoach);
		
		context.close(); 
		
		
		
		
	}
}
