package ipmsg;

import java.net.*;
import java.io.*;

public class AppTest {
    public static void main(String[] args) throws Exception {
        Socket soc = new Socket(InetAddress.getByName("localhost"), 3000);
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(soc.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        pw.format("%s%n", "ping");
         pw.flush();
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
            pw.format("%s%n", "ping");
            pw.flush();
        }

        br.close();
        soc.close();
    }
}