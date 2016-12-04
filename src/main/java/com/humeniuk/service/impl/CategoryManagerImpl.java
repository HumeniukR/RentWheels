package com.humeniuk.service.impl;

import com.humeniuk.dao.CategoryDAO;
import com.humeniuk.domain.Category;
import com.humeniuk.service.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryManagerImpl implements CategoryManager {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<Category> getAllCategorys() {
        return categoryDAO.getAllCategorys();
    }
}
