package com.lemon.springcloud.service;

import com.lemon.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> findAll();
    Dept findById(Long id);
}
