package com.humeniuk.service.impl;

import com.humeniuk.dao.CategoryDAO;
import com.humeniuk.domain.Category;
import com.humeniuk.service.CategoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManagerImpl implements CategoryManager {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<Category> getAllCategories() {

        return categoryDAO.getAllCategories();
    }
}
