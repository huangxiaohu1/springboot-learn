package com.spring.springboot.controller;

import com.spring.springboot.bean.CityBean;
import com.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title : CityController</p>
 *
 * @author : huangxiaohu
 * @version : 1.0.0
 * @date : 2019/7/15 20:22
 */
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "api/city", method = RequestMethod.GET)
    public CityBean getCity(@RequestParam(value = "cityName", required = true) String cityName) {

        return cityService.getCityByName(cityName);
    }
}
