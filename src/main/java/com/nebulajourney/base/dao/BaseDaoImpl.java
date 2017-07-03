package com.nebulajourney.base.dao;

import com.nebulajourney.base.PageUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by mr_zhou on 2017/6/30.
 */
public class BaseDaoImpl<T,ID extends Serializable> implements BaseDao<T,ID> {

    @Autowired
    private SessionFactory sessionFactory;
    protected Class<T> entityClass;

    public BaseDaoImpl() {
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
    protected Class getEntityClass() {
        if (entityClass == null) {
            entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return entityClass;
    }


    @Override
    public T get(ID id) {
        return (T) this.getSession().get(entityClass,id);
    }

    @Override
    public T load(ID id) {
        return (T) this.getSession().load(entityClass,id);
    }

    @Override
    public void save(T entity) {
        this.getSession().save(entity);
    }

    @Override
    public void saveOrUpdate(T entity) {
        this.getSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {
        this.getSession().delete(entity);
    }

    @Override
    public void refresh(T entity) {
        this.getSession().refresh(entity);
    }

    @Override
    public List<T> getListByHql(String hql,Object... param) {
        Query query = this.getSession().createQuery(hql);
        if (param != null){
            for (int i = 0; i < param.length; i++) {
                query.setParameter(i,param[i]);
            }
        }
        return query.list();
    }

    @Override
    public List<T> getListBySql(String sql,Object... param) {
        Query query = this.getSession().createSQLQuery(sql);
        if (param != null){
            for (int i = 0; i < param.length; i++) {
                query.setParameter(i,param[i]);
            }
        }
        return query.list();
    }

    @Override
    public PageUtils<T> getPage(String hql, PageUtils<T> page,Object...param) {
        Query query = this.getSession().createQuery(hql);
        if (param != null){
            for (int i = 0; i < param.length; i++) {
                query.setParameter(i,param[i]);
            }
        }
        int currentPage = page.getCurrentPage()>0?page.getCurrentPage():1;
        page.setCurrentPage(currentPage);

        return null;
    }
}
