package com.lemon.springcloud.dao;

import com.lemon.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDao {

    //@Insert("insert into dept(dname,db_source) values (#{dname},DATABASE())")
    boolean addDept(Dept dept);

    @Select("select * from dept where deptno = #{deptno}")
    Dept queryById(Long id);
    //@Select("select * from dept")
    List<Dept> queryAll();
}
