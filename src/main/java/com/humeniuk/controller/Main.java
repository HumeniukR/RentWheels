package com.humeniuk.controller;

import com.humeniuk.domain.Category;
import com.humeniuk.service.CategoryManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext(
                "appContext.xml");
        CategoryManager categoryManager = (CategoryManager) appContext.getBean("categoryManagerImpl");

        List<Category> list = categoryManager.getAllCategories();
        System.out.println("Category count: " + list.size());


    }
}
