package com.zz.kkk_video.domain;

import java.io.Serializable;
import java.util.Date;

/*
章类
 */
public class Chapter implements Serializable {

  private Integer id;
  private String title; //标题
  private Integer videoId;//视频id
  private Integer ordered;//顺序
  private java.util.Date createTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public Integer getOrdered() {
    return ordered;
  }

  public void setOrdered(Integer ordered) {
    this.ordered = ordered;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
