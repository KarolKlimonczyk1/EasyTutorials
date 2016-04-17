package com.rest.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.dao.ArticlesDAO;
import com.rest.model.Articles;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticlesDAO articlesDao;
	
	@Transactional
	public Articles getArticle(Integer id) {
		return articlesDao.getArticle(id);
	}

	
}
