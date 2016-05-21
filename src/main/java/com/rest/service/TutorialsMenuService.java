package com.rest.service;

import com.rest.model.TutorialsMenu;

import java.util.List;

/**
 * Created by Karol on 5/21/2016.
 */
public interface TutorialsMenuService {

    public TutorialsMenu getTutorialInfo(Integer id);

    public void updateTutorialsMenu(TutorialsMenu tutorialsMenu);

    public List<TutorialsMenu> getTutorialsMenu();
}
