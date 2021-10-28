package ClientTextual;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyServer {
    
    private static final ConcurrentHashMap chm = new ConcurrentHashMap();

    public static void main(String[] args) {
        
        MyServerSocket ss = new MyServerSocket(Integer.parseInt(args[0]));
        ExecutorService pool = Executors.newFixedThreadPool(50);
        
        while(true) {
            pool.execute(new Task(ss.accept()));
        }
            /*MySocket s = ss.accept();
            new Thread() {
                public void run(){
                    String line;
                    while((line = s.readLine()) != null) {
                        try {
                            s.println(line);
                        } catch (IOException ex) {
                            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }.start();*/
            
    }

    public static class Task implements Runnable {
        
        private MySocket sc;
        
        public Task(MySocket s) {
            sc = s;
        }
        
        @Override
        public void run() {
            
        }
        
    }

}
