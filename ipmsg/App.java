package ipmsg;

import java.net.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        ServerSocket servSoc = new ServerSocket(3000);

        while(true) {
            final Socket soc = servSoc.accept();

            Thread service = new Thread(new Runnable() {
               public void run() {
                    try {
                        InetSocketAddress socAddr = (InetSocketAddress) soc.getRemoteSocketAddress();
                        PrintWriter pw = new PrintWriter(new BufferedOutputStream(soc.getOutputStream()));
                        BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                        String line = null;
                        while((line = br.readLine()) != null) {
                            System.out.println(line);
                            pw.format("%s%n", "pong");
                            pw.flush();
                        }
                        // pw.format("Host: %s%n", socAddr.getHostName());
                        // pw.format("Ip: %s%n", socAddr.getAddress().toString());
                        pw.close();
                        soc.close();
                    } catch(Exception e) {
                        System.out.println(e);
                    }
               }
            });

            service.start();
        }
    }
}