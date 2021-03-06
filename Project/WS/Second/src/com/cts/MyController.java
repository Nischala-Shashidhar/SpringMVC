package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.User;
import com.cts.validator.UserValidator;

@Controller
public class MyController{
	
	@Autowired
	UserValidator userValidator;
	
	@RequestMapping("loginApplication")
	public ModelAndView loginApplication(
			@RequestParam("userName") String userName, @ModelAttribute User user) {
		ModelAndView result;
		if ("user".equals(userName)) {
			result = new ModelAndView("welcomePage");

		} else {
			result = new ModelAndView("error");
		}

		return result;
	}

	/*@RequestMapping("getAscDetails")
	public ModelAndView getAscDetails(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("userDetails");
		modelAndView.addObject("user", user);
		return modelAndView;
	}*/

	@RequestMapping("getAscDetails")
	public ModelAndView getAscDetails(@ModelAttribute User user,
			BindingResult result, Model model) {

		userValidator.validate(user, result);

		if (result.hasFieldErrors()) {
			ModelAndView modelAndView = new ModelAndView("welcomePage");
			modelAndView.addObject("user", user);
			return modelAndView;
		}

		ModelAndView modelAndView = new ModelAndView("userDetails");
		modelAndView.addObject("user", user);
		return modelAndView;
	}

}
