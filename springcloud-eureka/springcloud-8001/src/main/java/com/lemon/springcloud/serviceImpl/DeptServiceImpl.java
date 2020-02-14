package com.lemon.springcloud.serviceImpl;

import com.lemon.springcloud.dao.DeptDao;
import com.lemon.springcloud.entity.Dept;
import com.lemon.springcloud.service.DeptService;
import javafx.scene.chart.PieChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    public Dept findById(Long id) {
        return deptDao.findById(id);
    }
}
