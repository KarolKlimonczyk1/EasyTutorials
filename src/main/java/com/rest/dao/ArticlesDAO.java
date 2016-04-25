package com.rest.dao;

import com.rest.model.Articles;


public interface ArticlesDAO {

	public Articles getArticle(Integer id);

	public void updateArticle(String topic, String content);
}
