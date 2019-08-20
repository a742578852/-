package com.zz.kkk_video.domain;

import java.io.Serializable;
import java.util.Date;

/*
会员表
 */
public class User implements Serializable {

  private Integer id;
  private String openid;//微信开放id
  private String name;  //昵称
  private String headImg;//头像
  private Integer phone;//电话
  private String sign;//签名
  private Integer sex;//性别
  private String country;//国家
  private java.util.Date createTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public Integer getPhone() {
    return phone;
  }

  public void setPhone(Integer phone) {
    this.phone = phone;
  }


  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }


  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
