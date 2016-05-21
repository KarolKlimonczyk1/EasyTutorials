package com.rest.dao;

import com.rest.model.TutorialsMenu;

import java.util.List;

/**
 * Created by Karol on 5/21/2016.
 */
public interface TutorialsMenuDAO {

    public TutorialsMenu getTutorialInfo(Integer id);

    public void updateTutorialsMenu(TutorialsMenu tutorialsMenu);

    public List<TutorialsMenu> getTutorialsMenu();
}
