package com.chq.springbootweb.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: thinkpad
 * @Date: 2019/3/17 22:50
 * @Description:
 */
public class ServerAndSocket extends Thread {
    private ServerSocket serverSocket;
    static OutputStreamWriter osw = null;
    static Socket socket = null;
    public static PrintWriter pw= null;
    public ServerAndSocket() {
        try {
            serverSocket = new ServerSocket(8000, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void run() {
        System.out.println("等待用户链接...");
        //Socket socket = null;
        try {
            socket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("链接成功，可以通讯！");
        /* 服务器向客户端发送数据  */
        //OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw = new PrintWriter(osw, true);
        while (true) {

            /*if (temp.id!=0){
                pw.println(temp.id);
                temp.id=0;
            }
            if (temp.flag ) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("temp.hex = ");
                }
                temp.flag=false;
            }
            if (!(temp.hex == null || temp.hex == "")) {
                System.out.println("hex = " + temp.hex);
                pw.println(temp.hex);
                // temp.hex=null;
                for (int i = 0; i < 10; i++) {
                    System.out.println("temp.hex = " + temp.hex);
                }
            }*/


        }
    }

}
