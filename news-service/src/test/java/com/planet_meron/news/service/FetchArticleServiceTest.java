package com.planet_meron.news.service;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.planet_meron.news.domain.entity.Article;

@SpringBootApplication
@ComponentScan(basePackages={"com.planet_meron.news"})
public class FetchArticleServiceTest {
	
	private static final String MAPPER_SCAN_BASE_PACKAGE = "com.planet_meron.news.persistence.mapper";
	
	@Bean
	@Autowired
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sqlSessionFactoryBean= new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() throws Exception {
		final MapperScannerConfigurer msc = new MapperScannerConfigurer();
		msc.setBasePackage(MAPPER_SCAN_BASE_PACKAGE);
		msc.afterPropertiesSet();
		return msc;
	}

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(FetchArticleServiceTest.class, args);
		FetchArticleService fetchArticleService = context.getBean(FetchArticleService.class);
		
		Article aArticle = fetchArticleService.getArticleById(3);
		if (aArticle != null) {
			
			System.out.println(aArticle.toString());
		}

	}

}
