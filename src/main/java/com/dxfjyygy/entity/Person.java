package com.dxfjyygy.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by longjinwen on 2017/3/17.
 */
public class Person implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    //    private Address address;
    private Set<Address> addresses = new HashSet<Address>();  //单向1 -N Person 1的一端

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
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
