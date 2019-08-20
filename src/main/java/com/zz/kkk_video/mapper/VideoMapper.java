package com.zz.kkk_video.mapper;

import com.zz.kkk_video.domain.Video;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * video数据访问层
 */
public interface VideoMapper {
    @Select("select * from video")
    List<Video> findAll();
    @Select("select * from video where id = #{id}")
    Video findById(int id);
    @Update("update video set title=#{title} where id=#{id}")
    int updateById(int id);
    @Delete("delete from video where id = #{id}")
    int delById(int id);
    @Insert("insert into video ")
    int save(Video video);

}
