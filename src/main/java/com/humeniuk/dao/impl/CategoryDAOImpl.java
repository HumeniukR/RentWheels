package com.humeniuk.dao.impl;

import com.humeniuk.dao.CategoryDAO;
import com.humeniuk.domain.Category;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Category> getAllCategorys() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Category> cq = builder.createQuery(Category.class);
        Root<Category> root = cq.from(Category.class);
        cq.select(root);
        return em.createQuery(cq).getResultList();
    }
}
