package com.chq.springbootweb.controller;

import com.chq.springbootweb.entity.ChineseData;
import com.chq.springbootweb.serial.SerialPort;
import com.chq.springbootweb.service.ChineseService;
import com.chq.springbootweb.socket.ServerAndSocket;
import com.chq.springbootweb.socket.temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Pattern;
import java.io.IOException;

/**
 * @Auther: thinkpad
 * @Date: 2019/2/26 14:50
 * @Description:
 */
@RestController
public class ChineseController {
   /* static SerialPort serialPort= new SerialPort();

    static {
    int i = serialPort.startComPort();
            if (i == 1) {
        serialPort.start();
        System.out.println("SerialPort is sucess");
    } else {
        System.out.println("SerialPort is fail");
    }
    }*/
  static {
       ServerAndSocket serverAndSocket = new ServerAndSocket();
           serverAndSocket.start();

   }
    @Autowired
    private ChineseService chineseService;
    @RequestMapping("test")
    @ResponseBody
    public ChineseData findHex(String formData){
        temp.flag = true;
        return chineseService.findHexByChinese(formData);
    }
}
