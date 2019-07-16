package com.spring.springboot.service;

import com.spring.springboot.bean.CityBean;

/**
 * <p>Title : CityService</p>
 *
 * @author : huangxiaohu
 * @version : 1.0.0
 * @date : 2019/7/15 20:43
 */
public interface CityService {
    CityBean getCityByName(String name);
}
