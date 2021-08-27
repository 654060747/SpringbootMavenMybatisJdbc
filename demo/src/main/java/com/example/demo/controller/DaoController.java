package com.example.demo.controller;

import com.example.demo.dao.DaoImp;
import com.example.demo.dao.MybatisDao;
import com.example.demo.dao.NetDao;
import com.example.demo.pojo.DaoUser;
import com.example.demo.service.DaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class DaoController {

    @Autowired
    private DaoService daoService;

//    @RequestMapping("/find_two")
    @GetMapping("/find_two")
    @PostMapping("/find_two")
    @ResponseBody
    public List<DaoUser> findAll() {
        return daoService.findAll();
    }


	@ResponseBody
	@RequestMapping("/find_sql")
//	public Object testJdbc(@PathVariable String id) { //指定id查询sql
	public List<DaoUser> testJdbc() {
		return daoService.testJdbc();
	}


	@Autowired
    private MybatisDao mybatisDao;

	@ResponseBody
	@RequestMapping("/mybatis")
    public List<DaoUser> queryAll() {
	    return mybatisDao.queryAll();
    }


}
