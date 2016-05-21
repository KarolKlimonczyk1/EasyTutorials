package com.rest.service;

import com.rest.dao.TutorialsMenuDAO;
import com.rest.model.TutorialsMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Karol on 5/21/2016.
 */

@Service
public class TutorialsMenuServiceImpl implements TutorialsMenuService {

    @Autowired
    TutorialsMenuDAO tutorialsMenuDAO;

    public TutorialsMenu getTutorialInfo(Integer id) {
        return tutorialsMenuDAO.getTutorialInfo(id);
    }

    public void updateTutorialsMenu(TutorialsMenu tutorialsMenu) {
        tutorialsMenuDAO.updateTutorialsMenu(tutorialsMenu);
    }

    public List<TutorialsMenu> getTutorialsMenu() {
        return tutorialsMenuDAO.getTutorialsMenu();
    }
}
