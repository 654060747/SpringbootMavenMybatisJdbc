package com.example.demo.dao;

import com.example.demo.mapper.DaoMapperImp;
import com.example.demo.pojo.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisDao {

    @Autowired
    private DaoMapperImp daoMapperImp;

    public List<DaoUser> queryAll() {
        return daoMapperImp.queryAll();
    }

}
