package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.SimpleBbsDto;
@Mapper
public interface ISimpleBbsDao {
    List<SimpleBbsDto> listDao();
    SimpleBbsDto viewDao(String id);
    Integer writeDao(String writer, String title, String content);
    Integer deleteDao(@Param("_id") String id);
}

