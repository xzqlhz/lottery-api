package com.lottery.api.mapper;

import com.lottery.api.bean.ForeignInterface;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ForeignInterfaceMapper {
    @Delete({
        "delete from foreign_interface",
        "where name_en = #{nameEn,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String nameEn);

    @Insert({
        "insert into foreign_interface (name_zh, request_url, ",
        "request_header, request_parameters, ",
        "local_url, check_url)",
        "values (#{nameZh,jdbcType=VARCHAR}, #{requestUrl,jdbcType=VARCHAR}, ",
        "#{requestHeader,jdbcType=VARCHAR}, #{requestParameters,jdbcType=VARCHAR}, ",
        "#{localUrl,jdbcType=VARCHAR}, #{checkUrl,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="nameEn", before=false, resultType=String.class)
    int insert(ForeignInterface record);

    @Select({
        "select",
        "name_en, name_zh, request_url, request_header, request_parameters, local_url, ",
        "check_url",
        "from foreign_interface",
        "where name_en = #{nameEn,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="name_en", property="nameEn", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name_zh", property="nameZh", jdbcType=JdbcType.VARCHAR),
        @Result(column="request_url", property="requestUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="request_header", property="requestHeader", jdbcType=JdbcType.VARCHAR),
        @Result(column="request_parameters", property="requestParameters", jdbcType=JdbcType.VARCHAR),
        @Result(column="local_url", property="localUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="check_url", property="checkUrl", jdbcType=JdbcType.VARCHAR)
    })
    ForeignInterface selectByPrimaryKey(String nameEn);

    @Update({
        "update foreign_interface",
        "set name_zh = #{nameZh,jdbcType=VARCHAR},",
          "request_url = #{requestUrl,jdbcType=VARCHAR},",
          "request_header = #{requestHeader,jdbcType=VARCHAR},",
          "request_parameters = #{requestParameters,jdbcType=VARCHAR},",
          "local_url = #{localUrl,jdbcType=VARCHAR},",
          "check_url = #{checkUrl,jdbcType=VARCHAR}",
        "where name_en = #{nameEn,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ForeignInterface record);
}