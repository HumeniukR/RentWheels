package com.humeniuk.controller;

import com.humeniuk.domain.Category;
import com.humeniuk.service.CategoryManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hibernate, spring hello");

        ApplicationContext jpaContext = new ClassPathXmlApplicationContext(
                "jpaContext.xml");

        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                new String[]{"appContext.xml"}, jpaContext);

       System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));
        System.out.println(Arrays.toString(jpaContext.getBeanDefinitionNames()));
        CategoryManager categoryManager = (CategoryManager) jpaContext.getBean("categoryManagerImpl");

        List<Category> list = categoryManager.getAllCategories();
        System.out.println("Category count: " + list.size());


    }
}
