package com.rest.dao;

import javax.inject.Inject;

import com.rest.model.ChangedArticle;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.rest.model.Articles;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticlesDAOImpl implements ArticlesDAO {

	@Inject
	private SessionFactory sessionFactory;

	public Articles getArticle(Integer id) {

		Session session = sessionFactory.getCurrentSession();
		   return (Articles) session.createCriteria(Articles.class).add(Restrictions.idEq(id)).uniqueResult();

	}

	@Transactional
	public List<Articles> getArticles() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Articles.class);
		return criteria.list();
	}

	public void updateArticle(ChangedArticle changedArticle) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Articles.class);
		criteria.add(Restrictions.eq("id", changedArticle.getTopic() + 1));
		Articles article = (Articles) criteria.uniqueResult();
		article.setTopic(changedArticle.getNewTopic());
		article.setContent(changedArticle.getContent());

		session.saveOrUpdate(article);
	}
}
