package com.lemon.springcloud.controller;

import com.lemon.springcloud.entity.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptConsumerController {

    @Resource
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8001";

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(URL+"/dept/list",List.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return restTemplate.getForObject(URL+"/dept/get/"+id,Dept.class);
    }
}
