package com.chq.springbootweb.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Auther: thinkpad
 * @Date: 2019/4/22 12:02
 * @Description:
 */
public class ServerThread extends Thread {
    public static PrintWriter pw= null;
    public static OutputStreamWriter osw = null;
    Socket socket = null;

    public ServerThread(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            osw = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw = new PrintWriter(osw, true);
    }
}
