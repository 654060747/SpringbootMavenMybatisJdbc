package com.example.demo.mapper;

import com.example.demo.pojo.DaoUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaoMapperImp {
    List<DaoUser> queryAll();
}
