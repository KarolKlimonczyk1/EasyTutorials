package com.rest.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Karol on 4/17/2016.
 */
public class ChangeViewControllerTest {

    @InjectMocks
    private ChangeViewController changeViewController;

    private MockMvc mockMvc;


    @Before
    public void setup() {

        // Process mock annotations
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(changeViewController).build();
    }

    @Test
    public void testJavaBasic() throws Exception {
        this.mockMvc.perform(get("/java-basic"))
                .andExpect(status().isOk());
    }

    @Test
    public void testCppBasic() throws Exception {

        this.mockMvc.perform(get("/cplus-basic"))
                .andExpect(status().isOk());
    }

}