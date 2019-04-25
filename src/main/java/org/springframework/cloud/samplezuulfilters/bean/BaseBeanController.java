package org.springframework.cloud.samplezuulfilters.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basebean/")
public class BaseBeanController {
    @Autowired
    private BaseBeanContainer container;

    @GetMapping("")
    public void echo(){
        container.getBaseBean().values();
    }
}
