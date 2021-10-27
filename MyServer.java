package ClientTextual;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyServer {

    public static void main(String[] args) {
        MyServerSocket ss = new MyServerSocket(Integer.parseInt(args[0]));
        
        while(true) {
            MySocket s = ss.accept();
            new Thread() {
                public void run(){
                    String line;
                    while((line = s.readLine()) != null) {
                        s.println();
                    }
                }
            }.start();
        }
    }
}
