package com.nebulajourney.dao.interfaces;

import com.nebulajourney.entity.ApplicationEntity;

import java.util.List;

/**
 * Created by mr_zhou on 2017/6/27.
 */
public interface ApplicationEntityDao {

    List<ApplicationEntity> findAll();

}
