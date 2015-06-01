package com.planet_meron.news.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planet_meron.news.domain.entity.Article;
import com.planet_meron.news.service.FetchArticleService;
import com.planet_meron.news.service.dao.ArticleDao;

@Service("fetchArticleService")
public class FetchArticleSeviceImpl implements FetchArticleService{

	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public Article getArticleById(int id) {
		
		return articleDao.getArticleById(id);
	}

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return articleDao.getAllArticles();
	}
}
