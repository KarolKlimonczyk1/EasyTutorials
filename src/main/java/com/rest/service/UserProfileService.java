package com.rest.service;

import com.rest.model.UserProfile;

import java.util.List;

/**
 * Created by Karol on 5/15/2016.
 */
public interface UserProfileService {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);

}
