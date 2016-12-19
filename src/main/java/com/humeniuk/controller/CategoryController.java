package com.humeniuk.controller;

import com.humeniuk.service.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class CategoryController {

    private static final String CATEGORIES = "categories";

    @Autowired
    private CategoryManager categoryManager;

    @RequestMapping("/index")
    public String getAllCategories(Map<String, Object> model){
        model.put(CATEGORIES, categoryManager.getAllCategories());
        return CATEGORIES;
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }
}
