package com.nebulajourney.dao.impl;

import com.nebulajourney.dao.interfaces.ApplicationEntityDao;
import com.nebulajourney.entity.ApplicationEntity;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr_zhou on 2017/6/27.
 */
@Repository
public class ApplicationEntityDaoImpl implements ApplicationEntityDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<ApplicationEntity> findAll() {
        String hql = "from ApplicationEntity ";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

}
