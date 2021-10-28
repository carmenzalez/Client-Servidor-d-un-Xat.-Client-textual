package ClientTextual;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class MySocket extends Socket {
    
    public MySocket(String host, int port) throws IOException {
        //sc = new Socket(host, port);
        super(host, port);
    }
    
    public String readLine() {
        InputStream input = getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        return reader.readLine();
    }
    
    public void println(String line) {
        OutStream output = getOutputStream();
        PrintWriter printer = new Printwriter(output);
        writer.println(line);
    }
}
