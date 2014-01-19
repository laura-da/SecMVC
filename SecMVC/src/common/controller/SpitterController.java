package common.controller;

//For example,
//http://localhost:8080/spitter/spitters/spittles?spitter=habuma could be the URL for
//displaying all of the Spittles for a Spitter whose username is habuma.

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

import common.domain.Spitter;
import common.repository.SpitDAO;

@Controller
@RequestMapping("/spitters")
public class SpitterController {
	
	@Autowired
	private SpitDAO spitDao;

	public void setSpitDao(SpitDAO spitDao) {
		this.spitDao = spitDao;
	}
	
	@RequestMapping(method=RequestMethod.GET, params="new")
	  public String createSpitterProfile(Model model) {
		Spitter newspitter = new Spitter();
		newspitter.setUserName("alex");
	    model.addAttribute("Spitter", newspitter);
	    return "spitters/edit";
	  }
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String addSpitterFromForm(@Valid Spitter spitter,
			BindingResult bindingResult) {
		// TODO Auto-generated method stub
		
		if(bindingResult.hasErrors()){
			return"spitters/edit";
		}
		
		spitDao.addSpitter(spitter);
		return "redirect:/spitters/" + spitter.getUserName();
	}
	
	@RequestMapping(value="/{username}",method=RequestMethod.GET)
	public String showSpitterProfile(@PathVariable String username,
	Model model){
	model.addAttribute(spitDao.getSpitter(username));
	return "spitters/view";
	}
	
}
