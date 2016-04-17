package com.rest.controllers;

import com.rest.service.JsonParserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Random;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Karol on 4/17/2016.
 */
public class ArticleAndContactControllerTest {

    @Mock
    private JsonParserService jsonParserService;

    @InjectMocks
    private ArticleAndContactController articleAndContactController;

    private MockMvc mockMvc;

    @Before
    public void setup() {

        // Process mock annotations
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(articleAndContactController).build();
    }

    @Test
    public void testGetArticle() throws Exception {

        for(int i=0; i<100; i++) {
            this.mockMvc.perform(post("/list")
                    .content(generateString()))
                    .andExpect(status().isOk());

            this.mockMvc.perform(post("/list"))
                    .andExpect(status().is4xxClientError());
        }
    }

    private static String generateString()
    {
        Random random=new Random();
        char[] text = new char[50];
        int rand;
        for (int i = 0; i < text.length; i++)
        {
            rand=random.nextInt(60)+65;
            text[i] = (char)rand;
        }
        return new String(text);
    }
}