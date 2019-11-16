package assignment6_beanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainClass 
{

	public static void main(String[] args) 
	{
		// get an instance of the context 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// initialise instance of the coach 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call your desired method 
		System.out.println(theCoach.doExercise());
		
		//call dependency method 
		System.out.println(theCoach.getFortune());
		
		//close the context 
		context.close();
		

	}

}
