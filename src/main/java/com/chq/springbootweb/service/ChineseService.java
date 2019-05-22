package com.chq.springbootweb.service;


import com.chq.springbootweb.entity.ChineseData;
import com.chq.springbootweb.entity.ChineseData2;

/**
 * @Auther: thinkpad
 * @Date: 2019/2/26 14:15
 * @Description:
 */
public interface ChineseService {
    public ChineseData find(Integer id);
    public ChineseData findHexByChinese(String chinese);
    public ChineseData2 findHexByChinesevote(String voteData);
    public ChineseData2 ChineseToGBK(String chinese);
}
