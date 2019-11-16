package assignment6_beanScopes;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneTelling implements FortuneTelling
{

	@Override
	public String getFortune() 
	{
		// TODO Auto-generated method stub
		// this method will read a file 
		// generate a random number 
		// and return a random fortune 
		
		return "temp place holder";
	}
	
}
