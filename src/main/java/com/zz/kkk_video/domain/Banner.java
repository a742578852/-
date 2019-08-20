package com.zz.kkk_video.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * banner类
 */
public class Banner implements Serializable {

  private Integer id;
  private String img;   //图片地址
  private Integer onelabelId;   //一级分类id
  private java.util.Date createTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
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
