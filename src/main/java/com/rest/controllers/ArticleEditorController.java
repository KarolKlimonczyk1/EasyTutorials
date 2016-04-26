package com.rest.controllers;

import com.rest.model.Articles;
import com.rest.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Karol on 4/24/2016.
 */
@RestController
public class ArticleEditorController {

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/article-editor", method = RequestMethod.POST, headers = "Accept=application/json")
    public void setArticle(@RequestBody String json) {
        articleService.updateArticle("How it works?", json);
        System.out.println(json);

    }
}
