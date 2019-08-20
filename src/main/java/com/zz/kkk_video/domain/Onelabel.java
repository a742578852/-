package com.zz.kkk_video.domain;

import java.io.Serializable;
import java.util.Date;

/*
一级标签类
 */
public class Onelabel implements Serializable {

  private Integer id;
  private String name;//标签名
  private java.util.Date createTime;


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


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
