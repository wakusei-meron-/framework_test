package com.planet_meron.news.web.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.planet_meron.news.web.NewsWebApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = NewsWebApplication.class)
@WebAppConfiguration
public class NewsWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
