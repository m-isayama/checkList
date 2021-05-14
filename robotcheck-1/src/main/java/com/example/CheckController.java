package com.example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class CheckController {
	@Autowired
	private CheckService checkService;
	
	@GetMapping
    public String index(Model model) {
		List<Check> checklist = checkService.findAll();
        model.addAttribute("message", checklist);
        return "index";
    }
	
	@PostMapping(path = "saveCheckBox", params = "regist")
	public String create(@ModelAttribute Check result) {
		checkService.update(result);
		return "redirect:/";
	}
	
}
