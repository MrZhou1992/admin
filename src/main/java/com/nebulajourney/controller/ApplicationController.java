package com.nebulajourney.controller;

import com.nebulajourney.service.interfaces.ApplicationEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mr_zhou on 2017/6/28.
 */
@Controller
@RequestMapping("application")
public class ApplicationController {

    @Autowired
    private ApplicationEntityService applicationEntityService;

    @RequestMapping("/getList")
    @ResponseBody
    public Object getList(){
        return applicationEntityService.getList();
    }

}
