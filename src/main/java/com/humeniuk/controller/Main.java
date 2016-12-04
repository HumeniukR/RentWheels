package com.humeniuk.controller;

import com.humeniuk.domain.Category;
import com.humeniuk.domain.Person;
import com.humeniuk.service.CategoryManager;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hibernate, spring hello");

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "context.xml");
        CategoryManager categoryManager = (CategoryManager) ctx.getBean("categoryManagerImpl");

        List<Category> list = categoryManager.getAllCategorys();
        System.out.println("Category count: " + list.size());

//        Session session = HibernateSessionFactory.getSessionFactory().openSession();
//
//        session.beginTransaction();
//
//        Person person = new Person();
//
//        person.setName("Anatoliy");
//        person.setLastName("Anitsay");
//        person.setEmail("a.anatoliy@rambler.ru");
//        person.setPhone("380974569785");
//        person.setIdAdress(100);
//
//        session.getTransaction().begin();
//        session.save(person);
//        session.getTransaction().commit();

    }
}
