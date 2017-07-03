package com.nebulajourney.service.impl;

import com.nebulajourney.dao.interfaces.ApplicationEntityDao;
import com.nebulajourney.entity.ApplicationEntity;
import com.nebulajourney.service.interfaces.ApplicationEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mr_zhou on 2017/6/28.
 */
@Service
public class ApplicationEntityServiceImpl implements ApplicationEntityService {

    @Autowired
    private ApplicationEntityDao applicationEntityDao;

    public List<ApplicationEntity> getList() {
        return applicationEntityDao.findAll();
    }
}
