package com.chq.springbootweb.service.impl;

import com.chq.springbootweb.entity.ChineseData;
import com.chq.springbootweb.entity.ChineseData2;
import com.chq.springbootweb.mapper.ChineseMapper;
import com.chq.springbootweb.serial.SerialPort;
import com.chq.springbootweb.service.ChineseService;
import com.chq.springbootweb.socket.ServerAndSocket;
import com.chq.springbootweb.socket.ServerThread;
import com.chq.springbootweb.socket.temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;
import java.util.TimerTask;

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
        String chartostr = new String();
        char c;
        ServerThread.pw.println("42,42,42,01");
        for (int i = 0; i < chinese.length(); i++) {
            c = chinese.charAt(i);
            chartostr = String.valueOf(c);
            System.out.println("chartostr = " + chartostr);
            chineseData = chineseMapper.findHexByChinese(chartostr);
            //temp.id = chineseData.getId();
            temp.hex1 = chineseData.getHex1();
            temp.hex2 = chineseData.getHex2();
            temp.hex3 = chineseData.getHex3();
            temp.hex4 = chineseData.getHex4();
            ServerThread.pw.println(temp.hex1);
            System.out.println("temp.hex1 = " + temp.hex1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ServerThread.pw.println(temp.hex2);
            System.out.println("temp.hex2 = " + temp.hex2);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ServerThread.pw.println(temp.hex3);
            System.out.println("temp.hex3 = " + temp.hex3);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ServerThread.pw.println(temp.hex4);
            System.out.println("temp.hex4 = " + temp.hex4);
          /*  temp.hex1 = chineseData.getHex1();
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
            System.out.println("chineseData = " + temp.hex);*/
        }

        return chineseData;

    }

    @Override
    public ChineseData2 findHexByChinesevote(String voteData) {
        ChineseData2 chineseData2 = new ChineseData2();
       // ServerThread.pw.println("42,42,02");
        chineseData2 = chineseMapper.ChineseToGBK(voteData);
        temp.hex = chineseData2.getHex();
        ServerThread.pw.println("42,42,02,"+temp.hex);
        System.out.println("temp.hex = " + temp.hex);
        return chineseData2;
    }

    @Override
    public ChineseData2 ChineseToGBK(String chinese) {

        ChineseData2 chineseData2 = new ChineseData2();
        String chartostr = new String();
        String stringLength = new String();
        char c;
        if (chinese.length()==2){
            chinese = chinese.charAt(0)+" "+chinese.charAt(1);
        }
        //ServerThread.pw.println("42,42,01");
        for (int i = 0; i < chinese.length(); i++) {
            c = chinese.charAt(i);
            chartostr = String.valueOf(c);
            System.out.println("chartostr = " + chartostr);
            chineseData2 = chineseMapper.ChineseToGBK(chartostr);
            //temp.id = chineseData.getId();
            temp.hex = chineseData2.getHex();
            stringLength = stringLength+temp.hex;
           // ServerThread.pw.println(temp.hex);
            System.out.println("temp.hex = " + temp.hex);
        }
        ServerThread.pw.println("42,42,01,"+stringLength);

        return chineseData2;
    }
}
