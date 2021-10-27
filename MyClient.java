package ClientTextual;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class MyClient {

    public static void main(String[] args) {
        
        MySocket sc = new MySocket(args[0], Integer.parseInt(args[1]));
        
        // Input thread
        new Thread() {
            public void run() {
                String line;
                BufferedReader in = new BufferedReader(new.InputStreamReader(System.in));
                try {
                    while((line = in.readLine()) != null) {
                        sc.println(line);
                        //line = in.readLine();
                    }
                } catch(IOException e) {
                    e.printStackTrace();
                }
                // close sc for writing
                in.close();
                
            } 
        }.start();
          
        // Output thread
        new Thread() {
            public void run() {
                //PrintWriter out = new PrintWriter(sc.getOutputStream(System.out));
                while((line = sc.readLine()) != null) {
                    System.out.println(line);
                }
                // close sc for reading
                //out.close();
            }
        }.start();
    }
}
