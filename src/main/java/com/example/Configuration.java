package com.example;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import javax.servlet.annotation.WebServlet;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }

    @Bean
    public HiberSessionFactory userDao() {
        return new HiberSessionFactory();
    }

}
