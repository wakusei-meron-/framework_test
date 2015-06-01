package com.planet_meron.news.service.dao;

import java.util.List;

import com.planet_meron.news.domain.entity.Article;

public interface ArticleDao {

	public Article getArticleById(int id);
	
	public List<Article> getAllArticles();
}
