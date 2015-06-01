package com.planet_meron.news.service.dao.mock;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.planet_meron.news.domain.entity.Article;
import com.planet_meron.news.service.dao.ArticleDao;

@Repository
public class MockArticleDao implements ArticleDao{

	@Override
	public Article getArticleById(int id) {
		return null;
	}

	@Override
	public List<Article> getAllArticles() {
		return null;
	}
}
