package com.dxfjyygy.entity;

import java.io.Serializable;

/**
 * Created by longjinwen on 2017/3/17.
 */
public class Person implements Serializable{
    private Integer id;
    private String name;
    private Integer age;
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
