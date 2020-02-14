package com.lemon.springcloud.controller;

import com.lemon.springcloud.dao.DeptDao;
import com.lemon.springcloud.entity.Dept;
import com.lemon.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;


    @GetMapping("/dept/list")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return deptService.findById(id);
    }

    //注册进来的微服务 获取一些信息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery:"+services);

        //得到一个具体的微服务信息，通过具体的微服务id，applicationName;
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost());
            System.out.println(instance.getServiceId());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
        }
        return this.client;
    }
}
