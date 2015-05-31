package com.planet_meron.news.service;

import com.planet_meron.news.domain.entity.Article;

public interface FetchArticleService {

	/**
	 * getArticleById(int id);  
	 * @param id
	 * @return
	 */
	public Article getArticleById(int id);
}
