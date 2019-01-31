package com.example.validatingforminput.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.validatingforminput.model.PersonForm;
/**
 * 
 * @author Emmanuel Raj
 *
 *
 */

@Controller
public class PersonController implements WebMvcConfigurer
{
	
	public void addViewControllers(ViewControllerRegistry controllerRegistry)
	{
		controllerRegistry.addViewController("/results").setViewName("results");
	}
	
	
	@GetMapping("/")
	public String showForm(PersonForm personForm, BindingResult bindingResult)
	{
		return "form";
	}
	
	
	
	@PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult,Model model)
    {
		if(bindingResult.hasErrors())
		{
			return "form";
		}
		else
			
			model.addAttribute("username", personForm.getName());
		
		   System.out.println(personForm.getName());
			
			return "redirect:/results";
    }

}
