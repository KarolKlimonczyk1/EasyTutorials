package com.rest.dao;

import com.rest.model.Articles;
import com.rest.model.ChangedArticle;

import java.util.List;


public interface ArticlesDAO {

	public Articles getArticle(Integer id);

	public List<Articles> getArticles();

	public void updateArticle(ChangedArticle changedArticle);
}
