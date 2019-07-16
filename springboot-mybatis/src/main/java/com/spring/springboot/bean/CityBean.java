package com.spring.springboot.bean;

/**
 * <p>Title : CityBean</p>
 *
 * @author : huangxiaohu
 * @version : 1.0.0
 * @date : 2019/7/15 20:02
 */
public class CityBean {


    /**城市编码**/
    private long id;
    /**省份编号**/
    private long provinceId;
    /**城市名称**/
    private String cityName;
    /**描述**/
    private String description;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CityBean{");
        sb.append("id=").append(id);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityName='").append(cityName).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
