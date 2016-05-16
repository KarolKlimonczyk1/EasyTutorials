package com.rest.dao;

import com.rest.model.User;

/**
 * Created by Karol on 5/15/2016.
 */
public interface UserDao {

    void save(User user);

    User findById(int id);

    User findBySSO(String sso);

}
