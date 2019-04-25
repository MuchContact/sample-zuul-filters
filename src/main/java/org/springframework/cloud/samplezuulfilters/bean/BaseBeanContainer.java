package org.springframework.cloud.samplezuulfilters.bean;

import java.util.Map;

public class BaseBeanContainer {
    private Map<String, BaseBean> baseBean;

    public BaseBeanContainer() {
    }

//    public BaseBeanContainer(Map<String, BaseBean> baseBeans) {
//        this.baseBean = baseBeans;
//    }

    public void setBaseBean(Map<String, BaseBean> baseBean) {
        this.baseBean = baseBean;
    }

    public Map<String, BaseBean> getBaseBean() {
        return baseBean;
    }
}
