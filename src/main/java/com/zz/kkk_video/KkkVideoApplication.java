package com.zz.kkk_video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zz.kkk_video.mapper")
public class KkkVideoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KkkVideoApplication.class, args);

	}

}
