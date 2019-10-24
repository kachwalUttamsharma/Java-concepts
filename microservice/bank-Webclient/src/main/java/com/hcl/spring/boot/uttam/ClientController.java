package com.hcl.spring.boot.uttam;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ClientController {

	@Autowired
	ClientServiceUser clientServiceUser;
	@Autowired 
	ClientServiceAccounts clientServiceAccounts;

	@RequestMapping("/home")
	public ModelAndView home(ModelAndView mode1) {
		mode1.addObject("user", new User());
		mode1.setViewName("Login");
		return mode1;
	}

	@RequestMapping("/Authenticate")
	public ModelAndView loginAuthentication(@ModelAttribute User user) {
		System.out.println(user.getUsername());
	 System.out.println(user.getPassword());
		   String result = clientServiceUser.login(user);
		   if (result.equals("login Successfull")) {
			   return new ModelAndView("AccountHome");
		   }else {
			   return new ModelAndView("Login");
		   }
	}
	  @RequestMapping("/viewAccounts")
	    public ModelAndView viewAccounts(ModelAndView model) {
		  System.out.println("/ViewAccounts ");
	  List<account> account = clientServiceAccounts.getAccount(1);
	  System.out.println("\n\n\n\n"+account.get(0).toString()+"\n\n\n\n");
	  System.out.println("\n\n\n\n completed \n\n\n");
	  model.addObject("accountss" , account);
	  model.setViewName("accounts");
	  return model;
	    }

}
