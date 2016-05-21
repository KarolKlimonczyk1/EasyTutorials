package com.rest.dao;

import com.rest.model.Articles;
import com.rest.model.TutorialsMenu;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Karol on 5/21/2016.
 */

@Repository
public class TutorialsMenuDAOImpl implements TutorialsMenuDAO {

    @Inject
    private SessionFactory sessionFactory;

    public TutorialsMenu getTutorialInfo(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return (TutorialsMenu) session.createCriteria(TutorialsMenu.class).add(Restrictions.idEq(id)).uniqueResult();

    }

    @Transactional
    public void updateTutorialsMenu(TutorialsMenu tutorialsMenu) {

        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(TutorialsMenu.class);
        criteria.add(Restrictions.eq("title", tutorialsMenu.getTitle()));
        TutorialsMenu tempTutorial = (TutorialsMenu) criteria.uniqueResult();
        tempTutorial.setPicture(tutorialsMenu.getPicture());
        tempTutorial.setTitle(tutorialsMenu.getTitle());

        session.saveOrUpdate(tempTutorial);

    }

    @Transactional
    public List<TutorialsMenu> getTutorialsMenu() {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(TutorialsMenu.class);
        return criteria.list();
    }
}
