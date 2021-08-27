package com.example.demo.pojo;


import javax.persistence.*;
import java.io.Serializable;

// @Entity @Table @Id @GeneratedValue @Column注解配合JpaRepository接口使用注入
@Entity //代表这是一个实体类
@Table(name = "user") //用来对应数据库中的use表
public class DaoUser implements Serializable {
    @Id //用来表达主键
    @GeneratedValue
    private int id;
    @Column(name = "nickname") //表明一个id属性
    private String nickname;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;

    @Override
    public String toString() {
        return "DaoUser{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
