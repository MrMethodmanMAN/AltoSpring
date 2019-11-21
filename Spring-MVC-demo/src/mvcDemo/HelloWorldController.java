package mvcDemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//use of parent mapping 
@RequestMapping("/hello")
public class HelloWorldController 
{
	 // need a controller method to show the intial tml form 
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	// need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloWorld";
	}
	
	
	// new contorller method to read from data 
	// add tdata to teh model r3
	@RequestMapping("/processFormVersionTwo")
	public String shouting(HttpServletRequest request, Model model)
	{
		// read the request parameter from html form 
		 String theName = request.getParameter("studentName");
		
		//convert data to upper case 
		 theName = theName.toUpperCase();
		
		// create message 
		 String result  = "Yo! " + theName;
		 		
		// add message to model 		 
		 model.addAttribute("message", result);
		 
		return "helloWorld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,
			Model model)
	{

		//convert data to upper case 
		 theName = theName.toUpperCase();
		
		// create message 
		 String result  = "Hey there " + theName;
		 		
		// add message to model 		 
		 model.addAttribute("message", result);
		
		 // name of the method found in view
		return "helloWorld";
	}

	
	
	
}
