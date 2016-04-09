package com.rest.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rest.model.Articles;

@Repository
public class ArticlesDAOImpl implements ArticlesDAO {

	@Inject
	private SessionFactory sessionFactory;

	public Articles getArticle(Integer id) {
		 Session session = sessionFactory.getCurrentSession();  
		   return (Articles) session.createCriteria(Articles.class).add(Restrictions.idEq(id)).uniqueResult();
		 
	}
}
