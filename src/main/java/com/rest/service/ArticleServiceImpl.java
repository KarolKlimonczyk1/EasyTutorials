package com.rest.service;

import com.rest.model.ChangedArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.dao.ArticlesDAO;
import com.rest.model.Articles;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticlesDAO articlesDao;
	
	@Transactional
	public Articles getArticle(Integer id) {
		return articlesDao.getArticle(id);
	}

	public List<Articles> getArticles() {
		return articlesDao.getArticles();
	}

	@Transactional
	public void updateArticle(ChangedArticle changedArticle) {
		articlesDao.updateArticle(changedArticle);
	}


}
