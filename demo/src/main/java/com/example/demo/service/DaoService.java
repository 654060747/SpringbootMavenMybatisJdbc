package com.example.demo.service;

import com.example.demo.dao.NetDao;
import com.example.demo.pojo.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaoService {

    @Autowired
    private DaoServiceImp daoServiceImp;

    public List<DaoUser> findAll() {
        List<DaoUser> list;
        list = daoServiceImp.findAll();
        return list;
    }


	@Autowired
	private NetDao netDao;
	public List<DaoUser> testJdbc() {
		return netDao.findAll();
	}

}
