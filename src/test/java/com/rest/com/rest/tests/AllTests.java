package com.rest.com.rest.tests;

import com.rest.controllers.ArticleAndContactControllerTest;
import com.rest.service.JsonParserServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Karol on 4/17/2016.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ArticleAndContactControllerTest.class, JsonParserServiceTest.class})
public class AllTests {
}
