package com.planet_meron.news.persistence.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.planet_meron.news.domain.entity.Article;
import com.planet_meron.news.persistence.mapper.ArticleMapper;
import com.planet_meron.news.service.dao.ArticleDao;

@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao {

	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public Article getArticleById(int id) {
		// TODO Auto-generated method stub
		return articleMapper.findArticleById(id);
	}

}
