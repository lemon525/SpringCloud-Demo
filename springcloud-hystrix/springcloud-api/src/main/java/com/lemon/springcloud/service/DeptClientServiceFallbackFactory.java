package com.lemon.springcloud.service;

import com.lemon.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {


    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> findAll() {
                return null;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept().setDeptno(id).setDname("null 降级").setDb_source("No MySQL");
            }
        };
    }
}
