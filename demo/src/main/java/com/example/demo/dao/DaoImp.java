package com.example.demo.dao;

import com.example.demo.pojo.DaoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //接口继承接口实现，再使用@Autowired注解完成
public interface DaoImp extends JpaRepository<DaoUser, Long> {
//    JpaRepository自带数据库语句
//    直接使用接口实体类需要进行注解：@Entity @Table @Id @GeneratedValue @Column
    List<DaoUser> findAll();
}
