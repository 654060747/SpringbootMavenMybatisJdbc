package com.example.demo.dao;


import com.example.demo.pojo.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //直接实现接口导出所有接口方法，再进行需要的方法进行实现
public class NetDao implements JpaRepository<DaoUser,Integer> {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override //使用了jdbcTemplate查询数据库，实体类无需注解
    public List<DaoUser> findAll() {
        String sql = "select id,nickname,password,first_name,last_name from user";
        //将查询结果映射到Student类中，添加到list中，并返回
        RowMapper<DaoUser> user_dao = BeanPropertyRowMapper.newInstance(DaoUser.class);
        List<DaoUser> dao_user = jdbcTemplate.query(sql, user_dao);
        return dao_user;
    }

    @Override
    public List<DaoUser> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<DaoUser> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<DaoUser> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(DaoUser daoUser) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends DaoUser> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends DaoUser> S save(S s) {
        return null;
    }

    @Override
    public <S extends DaoUser> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<DaoUser> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends DaoUser> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends DaoUser> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<DaoUser> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public DaoUser getOne(Integer integer) {
        return null;
    }

    @Override
    public DaoUser getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends DaoUser> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends DaoUser> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends DaoUser> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends DaoUser> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends DaoUser> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends DaoUser> boolean exists(Example<S> example) {
        return false;
    }


}
