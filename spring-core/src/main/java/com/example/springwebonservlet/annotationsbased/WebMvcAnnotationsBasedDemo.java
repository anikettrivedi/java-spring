package com.example.springwebonservlet.annotationsbased;

import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebMvcAnnotationsBasedDemo {

    public static void main(String[] args) {
        DemoWebApplicationInitializer webApplicationInitializer = new DemoWebApplicationInitializer();
    }

    public static class DemoWebApplicationInitializer implements WebApplicationInitializer {

        @Override
        public void onStartup(jakarta.servlet.ServletContext sc) {
            AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();

            root.scan("com.example.springwebonservlet.annotationsbased");
            sc.addListener(new ContextLoaderListener(root));

            ServletRegistration.Dynamic appServlet = sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
            appServlet.setLoadOnStartup(1);
            appServlet.addMapping("/");
        }
    }

}
