package com.planet_meron.news.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

	@RequestMapping("/news")
	public String showNewsList() {
		
		return "news";
	}
}
