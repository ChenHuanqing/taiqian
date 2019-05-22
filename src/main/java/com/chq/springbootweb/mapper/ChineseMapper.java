package com.chq.springbootweb.mapper;

import com.chq.springbootweb.entity.ChineseData;
import com.chq.springbootweb.entity.ChineseData2;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: thinkpad
 * @Date: 2019/2/26 14:07
 * @Description:
 */
public interface ChineseMapper {

    @Select("SELECT * FROM chinese_lib WHERE id = #{id}")
    public ChineseData find(@Param("id") Integer id);

    @Select("SELECT * FROM chinese_lib WHERE chinese = #{chinese}")
    public ChineseData findHexByChinese(@Param("chinese") String chinese);

    @Select("SELECT * FROM chinese_lib WHERE chinese = #{chinese}")
    public ChineseData2 ChineseToGBK(@Param("chinese") String chinese);
}
