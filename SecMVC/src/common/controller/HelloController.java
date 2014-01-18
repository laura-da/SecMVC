package common.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/welcome2")
public class HelloController {
 
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		System.out.println("Helllooooo");
		model.addAttribute("message", "Spring Security Hello World");
		return "hello";
 
	}
 
}