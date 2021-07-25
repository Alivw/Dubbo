package com.awei.dubbo.model;

import java.io.Serializable;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-29 13:07
 **/
public class User implements Serializable {

    private String name;
    private Integer id;
    private Integer age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
