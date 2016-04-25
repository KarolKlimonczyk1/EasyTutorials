package com.rest.controllers;

import com.rest.model.Articles;
import com.rest.model.EmailTemplate;
import com.rest.service.ArticleService;
import com.rest.service.EmailService;
import com.rest.service.JsonParserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Karol on 4/17/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class ArticleAndContactControllerTest {

    @Mock
    ArticleService articleService;

    @Mock
    JsonParserService jsonParserService;

    @Mock
    EmailService emailService;

    @Mock
    EmailTemplate emailTemplate;

    @InjectMocks
    private ArticleAndContactController articleAndContactController;

    private MockMvc mockMvc;

    @Before
    public void setup() {

//        Mockito.when(emailService.sendEmail(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(),Mockito.anyString()));


        // Process mock annotations
        MockitoAnnotations.initMocks(this);

        Mockito.doNothing().when(emailService).sendEmail(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString());

        Mockito.when(emailTemplate.getSenderEmail()).thenReturn("senderEmail@email.com");
        Mockito.when(emailTemplate.getContent()).thenReturn("emailTemplateContent");
        Mockito.when(emailTemplate.getSenderName()).thenReturn("senderName");


        Articles articles = new Articles();
        articles.setId(1);
        articles.setTopic("topic1");
        articles.setContent("content1");
        Mockito.when(articleService.getArticle(Matchers.anyInt())).thenReturn(articles);

        Mockito.when(jsonParserService.parseArticle(Mockito.anyString())).thenReturn(articles);




        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(articleAndContactController).build();


    }

    @Test
    public void testGetArticle() throws Exception {


            this.mockMvc.perform(post("/list")
                    .content("{" + Mockito.anyString() + "}"))
                    .andExpect(status().isOk());

            this.mockMvc.perform(post("/list"))
                    .andExpect(status().is4xxClientError());

    }

    @Test
    public void testSendEmail() throws Exception {


    }
}