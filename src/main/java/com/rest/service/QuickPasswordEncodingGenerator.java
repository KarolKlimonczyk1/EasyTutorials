package com.rest.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Karol on 5/15/2016.
 */
public class QuickPasswordEncodingGenerator {

    public static void main(String[] args) {
        String password = "1234";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));

    }

}
