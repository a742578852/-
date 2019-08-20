package com.zz.kkk_video.domain;

import java.io.Serializable;
import java.util.Date;

/*
二级标签类
 */
public class Twolabel implements Serializable {

  private Integer id;
  private String name;//标签名
  private Integer onelabelId;//一级分类id
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


  public Integer getOnelabelId() {
    return onelabelId;
  }

  public void setOnelabelId(Integer onelabelId) {
    this.onelabelId = onelabelId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
