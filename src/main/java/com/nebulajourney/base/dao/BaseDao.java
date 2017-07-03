package com.nebulajourney.base.dao;

import com.nebulajourney.base.PageUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mr_zhou on 2017/6/29.
 */
public interface BaseDao<T,ID extends Serializable> {

    /**
     * 根据主键获取对象
     * @param id 主键
     * @return
     */
    T get(ID id);

    /**
     * 根据主键获取对象
     * @param id 主键
     * @return
     */
    T load(ID id);

    /**
     * 保存实体
     * @param entity
     */
    void save(T entity);

    /**
     * 保存实体
     * @param entity
     */
    void saveOrUpdate(T entity);

    /**
     * 删除
     * @param entity
     */
    void delete(T entity);

    /**
     * 刷新
     * @param entity
     */
    void refresh(T entity);

    /**
     * 获取列表
     * @param hql
     * @param param
     * @return
     */
    List<T> getListByHql(String hql,Object...param);

    /**
     * 获取列表
     * @param sql
     * @param param
     * @return
     */
    List<T> getListBySql(String sql,Object...param);

    /**
     * 分页获取列表
     * @param hql
     * @return
     */
    PageUtils<T> getPage(String hql,PageUtils<T> page,Object...param);

}
