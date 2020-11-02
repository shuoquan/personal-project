package com.shuoquan.springboot.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Address implements Serializable {

  private long id;
  private String openId;
  private String name;
  private String phone;
  private String alias;
  private String addr;

/*
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }*/

}
