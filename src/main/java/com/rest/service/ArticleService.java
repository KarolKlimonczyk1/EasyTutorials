package com.rest.service;

import com.rest.model.Articles;
import com.rest.model.ChangedArticle;

import java.util.List;

public interface ArticleService {

	public Articles getArticle(Integer id);

	public List<Articles> getArticles();

	public void updateArticle(ChangedArticle changedArticle);
}
