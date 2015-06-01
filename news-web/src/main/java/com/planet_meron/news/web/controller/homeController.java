package com.planet_meron.news.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

	@RequestMapping("/index")
	public String showHome(Model model) {

		// 反映されない...
		model.addAttribute("title", "Home");
		return "index";
	}
}
