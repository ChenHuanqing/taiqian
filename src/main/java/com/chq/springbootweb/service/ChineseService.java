package com.chq.springbootweb.service;


import com.chq.springbootweb.entity.ChineseData;

/**
 * @Auther: thinkpad
 * @Date: 2019/2/26 14:15
 * @Description:
 */
public interface ChineseService {
    public ChineseData find(Integer id);
    public ChineseData findHexByChinese(String chinese);
}
