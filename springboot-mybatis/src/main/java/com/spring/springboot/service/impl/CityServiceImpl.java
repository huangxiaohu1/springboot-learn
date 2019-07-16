package com.spring.springboot.service.impl;

import com.spring.springboot.bean.CityBean;
import com.spring.springboot.dao.CityDao;
import com.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title : CityServiceImpl</p>
 *
 * @author : huangxiaohu
 * @version : 1.0.0
 * @date : 2019/7/15 20:44
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public CityBean getCityByName(String name) {
        return cityDao.getCityByName(name);
    }
}
