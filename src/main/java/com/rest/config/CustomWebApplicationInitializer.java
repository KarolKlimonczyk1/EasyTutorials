//package com.rest.config;
//
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
///**
// * Created by Karol on 5/14/2016.
// */
//public class CustomWebApplicationInitializer implements WebApplicationInitializer {
//
//    public void onStartup(ServletContext servletContext) throws ServletException {
//
//        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//        rootContext.register(AppConfig.class);
//
//        servletContext.addListener(new ContextLoaderListener(rootContext));
//
//        AnnotationConfigWebApplicationContext dispatcherContext =
//                new AnnotationConfigWebApplicationContext();
//        dispatcherContext.register(SpringWebMvcInitializer.class);
//
//    }
//}
