package com.zz.kkk_video.domain;

import java.io.Serializable;
import java.util.Date;

/*
节表
 */
public class Epsiode implements Serializable {

  private Integer id;
  private String title;//标题
  private Integer num;//第几节
  private Integer duration;//时长 单位min
  private Integer chapterId;//章id
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


  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public Integer getChapterId() {
    return chapterId;
  }

  public void setChapterId(Integer chapterId) {
    this.chapterId = chapterId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
