package com.chq.springbootweb.aop;


import com.chq.springbootweb.serial.SerialPort;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Auther: thinkpad
 * @Date: 2019/2/26 15:02
 * @Description:
 */

@Component
@Aspect
public class WebAspect {
    @Pointcut("execution(* com.chq.springbootweb.controller..*.*(..))")
    public void executePackage(){
    }

    @Before("executePackage()")
    public void beforeAdvice(){
       /*  SerialPort serialPort= new SerialPort();


            int i = serialPort.startComPort();
            if (i == 1) {
                serialPort.start();
                System.out.println("SerialPort is sucess");
            } else {
                System.out.println("SerialPort is fail");
            }*/

    }

}
