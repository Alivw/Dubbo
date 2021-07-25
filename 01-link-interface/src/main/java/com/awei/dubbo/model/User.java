package com.awei.dubbo.model;

import java.io.Serializable;

/**
 * @program: Dubbo
 * @author: Awei
 * @create: 2021-01-29 11:40
 **/
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
