package com.example.demo.service;

import com.example.demo.dao.DaoImp;
import com.example.demo.pojo.DaoUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DaoServiceImp extends DaoImp {
    //    JpaRepository自带数据库语句
    List<DaoUser> findAll();
}
