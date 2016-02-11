package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.persistence.EntityManager;

@SpringBootApplication
public class HiberApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(HiberApplication.class, args);
        HiberSessionFactory hiberSessionFactory = ctx.getBean(HiberSessionFactory.class);

        Session session = hiberSessionFactory.getSessionFactory().openSession();
        User user = new User();
        user.setUserName("test name");
        Address address = new Address();
        address.setAddressLine("test address line");
        user.setAddress(address);

//ignores id if you set it manually
        session.save(user);
        session.flush();

        User user1 = new User();
        user1.setUserName("test name1");
        Address address1 = new Address();
        address1.setAddressLine("test address line1");
        user1.setAddress(address1);
//throws  The given object has a null identifier: com.example.User
//        session.update(user1);


        User user2 = new User();
        user2.setUserName("test name2");
        Address address2 = new Address();
        address2.setAddressLine("test address line2");
        user2.setAddress(address2);
        user2.setUserId(1);

//will do just this Hibernate: update user set user_name=? where id=?
        session.update(user2);

        session.flush();
        session.close();
    }
}
