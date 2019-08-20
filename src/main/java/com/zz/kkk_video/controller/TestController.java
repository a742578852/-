package com.zz.kkk_video.controller;

import com.zz.kkk_video.config.WeChatConfig;
import com.zz.kkk_video.domain.Video;
import com.zz.kkk_video.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class TestController {
    @Autowired
    private WeChatConfig weChatConfig;
    @Autowired
    private VideoMapper videoMapper;
    @RequestMapping("qq")
    public Object test(){

        return videoMapper.findById(1);
    }
}
