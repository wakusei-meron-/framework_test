package com.planet_meron.news.persistence;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.planet_meron.news.domain.entity.Article;
import com.planet_meron.news.persistence.mapper.ArticleMapper;

public class ArticleTest {

	private static final String MYBATIS_CONFIG = "com/planet_meron/news/persistence/mybatis-config.xml";
	private static SqlSessionFactory sessionFactory;		
	
	public static void main(String[] args) {
		
		try (Reader reader = Resources.getResourceAsReader(MYBATIS_CONFIG)) {
			
			sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			getAllArticles();

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	private static void getAllArticles(){
		
		try (SqlSession sqlSession = sessionFactory.openSession()){
			List<Article> resultList = sqlSession.getMapper(ArticleMapper.class).findAll();
			for(Article article : resultList) {
				System.out.println(article.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
