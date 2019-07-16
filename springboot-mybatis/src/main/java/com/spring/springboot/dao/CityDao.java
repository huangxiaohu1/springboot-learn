package com.spring.springboot.dao;

import com.spring.springboot.bean.CityBean;
import org.apache.ibatis.annotations.Param;
public interface CityDao {

    CityBean getCityByName(@Param("cityName") String cityName);
}
