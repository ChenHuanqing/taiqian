package com.chq.springbootweb.service.impl;

import com.chq.springbootweb.entity.ChineseData;
import com.chq.springbootweb.mapper.ChineseMapper;
import com.chq.springbootweb.serial.SerialPort;
import com.chq.springbootweb.service.ChineseService;
import com.chq.springbootweb.socket.ServerAndSocket;
import com.chq.springbootweb.socket.temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: thinkpad
 * @Date: 2019/2/26 14:15
 * @Description:
 */
@Service
public class ChineseServiceImpl implements ChineseService {
    @Autowired
    private ChineseMapper chineseMapper;


    @Override
    public ChineseData find(Integer id) {
        ChineseData chineseData = new ChineseData();
        chineseData = chineseMapper.find(id);
        //SerialPort.testString = chineseData.getHex();
        return chineseData;
    }

    @Override
    public ChineseData findHexByChinese(String chinese) {


        ChineseData chineseData = new ChineseData();
        chineseData = chineseMapper.findHexByChinese(chinese);
        //SerialPort.testString = chineseData.getHex();
        //temp.flag = true;
        temp.id = chineseData.getId();
        temp.hex = chineseData.getHex1();
        ServerAndSocket.pw.println("42,42,42");
        ServerAndSocket.pw.println(temp.hex);
        System.out.println("chineseData = " + temp.hex);
        temp.hex = chineseData.getHex2();
        ServerAndSocket.pw.println(temp.hex);
        System.out.println("chineseData = " + temp.hex);
        temp.hex = chineseData.getHex3();
        ServerAndSocket.pw.println(temp.hex);
        System.out.println("chineseData = " + temp.hex);
        temp.hex = chineseData.getHex4();
        ServerAndSocket.pw.println(temp.hex);
        System.out.println("chineseData = " + temp.hex);

//        SerialPort.testString = str;

        return chineseData;

    }
}
