package mvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//the  @ component is picked up by the component scan 
@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String showPage()
	{
			return "main-menu";
	}
	
}


