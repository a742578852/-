package com.zz.kkk_video.domain;

import java.io.Serializable;
import java.util.Date;

/*
课程表
 */
public class Video implements Serializable {

  private Integer id;
  private String title;//课程标题
  private String summary;//简介
  private String coverImg;//课程缩略图
  private Integer viewNum;//观看数
  private Integer price;  //价格
  private Integer online; //是否上线
  private java.util.Date createTime;
  private String suggest; //建议
  private String language;//语言
  private String level; //难度等级
  private Integer onelabelId;//一级分类
  private Integer twolabelId;//二级分类


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


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  public Integer getViewNum() {
    return viewNum;
  }

  public void setViewNum(Integer viewNum) {
    this.viewNum = viewNum;
  }


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  public Integer getOnline() {
    return online;
  }

  public void setOnline(Integer online) {
    this.online = online;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getSuggest() {
    return suggest;
  }

  public void setSuggest(String suggest) {
    this.suggest = suggest;
  }


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  public Integer getOnelabelId() {
    return onelabelId;
  }

  public void setOnelabelId(Integer onelabelId) {
    this.onelabelId = onelabelId;
  }


  public Integer getTwolabelId() {
    return twolabelId;
  }

  public void setTwolabelId(Integer twolabelId) {
    this.twolabelId = twolabelId;
  }

}
