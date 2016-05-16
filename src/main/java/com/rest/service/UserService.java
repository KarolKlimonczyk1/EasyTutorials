package com.rest.service;

import com.rest.model.User;

/**
 * Created by Karol on 5/15/2016.
 */
public interface UserService {

    void save(User user);

    User findById(int id);

    User findBySso(String sso);

}
