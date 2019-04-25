package org.springframework.cloud.samplezuulfilters.bean;

public class BaiduBean implements BaseBean {
    @Override
    public void echo(String name) {
        System.out.println("Baidu");
    }
}
