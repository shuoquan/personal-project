package com.shuoquan.springboot.entity;


import lombok.Data;

import java.io.Serializable;
@Data
public class Users implements Serializable {

  private String openId;
  private long auth;
  private String contractCode;
  private String planId;
  private long requestSerial;
  private String contractId;
  private long contractExpiredTime;
  private long contractStatus;
  private long createdAt;
  private long customerId;
  private long surplus;
  private String sessionKey;
  private String phone;
  private String userinfo;
  private long marks;


  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public long getAuth() {
    return auth;
  }

  public void setAuth(long auth) {
    this.auth = auth;
  }


  public String getContractCode() {
    return contractCode;
  }

  public void setContractCode(String contractCode) {
    this.contractCode = contractCode;
  }


  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public long getRequestSerial() {
    return requestSerial;
  }

  public void setRequestSerial(long requestSerial) {
    this.requestSerial = requestSerial;
  }


  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }


  public long getContractExpiredTime() {
    return contractExpiredTime;
  }

  public void setContractExpiredTime(long contractExpiredTime) {
    this.contractExpiredTime = contractExpiredTime;
  }


  public long getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(long contractStatus) {
    this.contractStatus = contractStatus;
  }


  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public long getSurplus() {
    return surplus;
  }

  public void setSurplus(long surplus) {
    this.surplus = surplus;
  }


  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getUserinfo() {
    return userinfo;
  }

  public void setUserinfo(String userinfo) {
    this.userinfo = userinfo;
  }


  public long getMarks() {
    return marks;
  }

  public void setMarks(long marks) {
    this.marks = marks;
  }

}
