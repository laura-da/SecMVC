package common.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import common.repository.SpitDAO;


@Controller
public class HomeController {

	@Autowired
	private SpitDAO sDao;
	
	 @RequestMapping(value={"/","/home"}, method=RequestMethod.GET)
	 public String showHomePage(Map<String, Object> model) {
	    model.put("spitters", sDao.findAllSpitters());
	    return "home";
	  }

	public void setsDao(SpitDAO sDao) {
		this.sDao = sDao;
	}
}
