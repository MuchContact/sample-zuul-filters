package org.springframework.cloud.samplezuulfilters.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class BaseBeanConfig {

    @Bean
    public GoogleBean googleBean() {
        return new GoogleBean();
    }


    @Bean
    public BaseBeanContainer baseBeanContainer(){
//        return new BaseBeanContainer(baseBeans);
        BaseBeanContainer baseBeanContainer = new BaseBeanContainer();
        baseBeanContainer.setBaseBean(baseBeans);
        return baseBeanContainer;
    }
    @Bean
    public BaiduBean baiduBean() {
        return new BaiduBean();
    }
    @Autowired
    private Map<String, BaseBean> baseBeans;
}
