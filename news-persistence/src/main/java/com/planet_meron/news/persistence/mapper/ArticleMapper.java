package com.planet_meron.news.persistence.mapper;

import java.util.List;

import com.planet_meron.news.domain.entity.Article;

public interface ArticleMapper {

	/**
	 * findAll(); 記事の全件取得
	 * 
	 *  return 記事のリスト
	 */
	List<Article> findAll();
	
	
	/**
	 * findArticleById(int id); 指定したidの記事の取得
	 * @param id　取得したい記事のid
	 * @return idの記事
	 */
	Article findArticleById(int id);
}
