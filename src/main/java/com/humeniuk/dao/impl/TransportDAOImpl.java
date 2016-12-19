package com.humeniuk.dao.impl;

import com.humeniuk.dao.TransportDAO;
import com.humeniuk.domain.Transport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class TransportDAOImpl implements TransportDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Transport> getTransportByCategoryId(int IdCategory) {
       // Query query = em.createNamedQuery("Transport.getByCategoryId");
       // query.setParameter("id_category", id_category);
        return null;
    }

    @Override
    public List<Transport> getTransportByPersonId(int IdPerson) {
        return null;
    }

    @Override
    public TransportDAO getTransportById() {
        return null;
    }
}
