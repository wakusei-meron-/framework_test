package com.planet_meron.news.service;

import java.util.List;

import com.planet_meron.news.domain.entity.Article;

public interface FetchArticleService {

	/**
	 * getArticleById(int id);  
	 * @param id
	 * @return
	 */
	public Article getArticleById(int id);
	
	/**
	 * getAllArticle(); 全ての記事の取得
	 * 
	 * @return 取得した記事のリスト
	 */
	public List<Article> getAllArticles();
}
