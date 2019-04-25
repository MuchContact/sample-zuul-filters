package org.springframework.cloud.samplezuulfilters.bean;

public class GoogleBean implements BaseBean {
    @Override
    public void echo(String name) {
        System.out.println("Google");
    }
}
