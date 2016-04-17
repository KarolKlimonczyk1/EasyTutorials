package com.rest.service;

import com.rest.model.Articles;
import com.rest.model.EmailTemplate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Karol on 4/17/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class JsonParserServiceTest {

    @Mock
    ArticleService articleService;

    @InjectMocks
    JsonParserService jsonParserService;

    @Before
    public void setUp() throws Exception {
        Articles articles=new Articles();
        articles.setId(1);
        articles.setTopic("topic1");
        articles.setContent("content1");
        Mockito.when(articleService.getArticle(Matchers.anyInt())).thenReturn(articles);
    }

    @Test
    public void testParseArticle() throws Exception {
        assertNotNull(jsonParserService.parseArticle("{"+Mockito.anyString()+"}"));
        assertEquals(jsonParserService.parseArticle("{}").getContent(), "content1");
    }

    @Test
    public void testParseEmail() throws Exception {
        assertNotNull(jsonParserService.parseEmail("{}"));
    }

}