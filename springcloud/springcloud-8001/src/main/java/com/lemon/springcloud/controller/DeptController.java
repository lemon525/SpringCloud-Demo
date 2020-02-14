package com.lemon.springcloud.controller;

import com.lemon.springcloud.dao.DeptDao;
import com.lemon.springcloud.entity.Dept;
import com.lemon.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @GetMapping("/dept/list")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return deptService.findById(id);
    }
}
