package com.example;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HiberSessionFactory {
    @Autowired
    private org.hibernate.SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        sessionFactory = sessionFactory;
    }
}
