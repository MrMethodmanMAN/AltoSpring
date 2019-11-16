package annotationsDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings 
	
	private String[] data = {"fortune 1", "fortune 2", "fortune 3"};
	private Random myRandom = new Random();

	
	@Override
	public String getFortune() 
	{
		//select random fortune from array 
		int index = myRandom.nextInt(data.length);
		System.out.println("random generated");
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
