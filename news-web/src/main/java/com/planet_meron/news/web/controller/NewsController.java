package com.planet_meron.news.web.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.planet_meron.news.domain.entity.Article;
import com.planet_meron.news.service.FetchArticleService;

@Controller
public class NewsController {

	@Autowired
	FetchArticleService articleService;

	@RequestMapping("/news")
	public String showNewsList(Model model) {

		List<Article> articleList = articleService.getAllArticles();
		for (Article article : articleList) {

			System.out.println(article.toString());
			SimpleDateFormat dFormat = new SimpleDateFormat("dd MMMM yyyy");
			model.addAttribute("date", dFormat.format(article.getCreatedAt()));
		}
		
		
        model.addAttribute("articles", articleList);
		return "news";
	}
}
