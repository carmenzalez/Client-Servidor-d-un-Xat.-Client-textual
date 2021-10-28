package ClientTextual;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class MySocket extends Socket {
    
    //Socket sc;
    
    
    /*public MySocket(Socket socket) throws IOException {
        sc = socket;
    }*/
    
    public MySocket(String host, int port) throws IOException {
        //sc = new Socket(host, port);
        super(host, port);
    }
    
    public int readLine() {
        
        
    }
    
    public void println() {
        
        
    }
}
