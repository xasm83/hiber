package com.example;

import javax.persistence.GeneratedValue;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    Integer userId;
    Address address;
    String userName;

    @Id
    @GeneratedValue()
    @Column(name = "id", unique = true, nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
