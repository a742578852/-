package com.zz.kkk_video.domain;


import java.io.Serializable;
import java.util.Date;
/*
订单表
 */

public class VideoOrder implements Serializable {

  private Integer id;
  private String openid;  //微信开放id
  private String outTradeNo;//订单唯一标识
  private Integer state;    //订单状态 0未支付 1已支付
  private java.util.Date createTime;
  private java.util.Date notifyTime;  //支付回调时间
  private Integer totalFee;   //支付金额 单位 分
  private String nickname;    //昵称
  private String headImg;     //头像
  private Integer videoId;    //课程id
  private String videoTitle;  //课程标题
  private String videoImg;    //课程缩略图
  private Integer userId;     //会员id
  private String ip;          //会员ip
  private Integer del;


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


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getNotifyTime() {
    return notifyTime;
  }

  public void setNotifyTime(Date notifyTime) {
    this.notifyTime = notifyTime;
  }

  public Integer getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Integer totalFee) {
    this.totalFee = totalFee;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  public String getVideoImg() {
    return videoImg;
  }

  public void setVideoImg(String videoImg) {
    this.videoImg = videoImg;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public Integer getDel() {
    return del;
  }

  public void setDel(Integer del) {
    this.del = del;
  }

}
