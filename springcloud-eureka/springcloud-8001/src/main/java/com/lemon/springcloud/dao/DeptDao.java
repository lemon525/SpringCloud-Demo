package com.lemon.springcloud.dao;

import com.lemon.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    List<Dept> findAll();
    Dept findById(Long id);
}
