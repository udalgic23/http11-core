import java.net.*;
import java.io.*;

public class HttpConnection extends Thread{
    private Socket socket;

    HttpConnection (Socket socket) {
        this.socket = socket;
    }

    public void run() {
    try (
        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true
        )
    ) {

        RequestParser requestParser =  new RequestParser(in);

    } catch (Exception e) {
        System.err.println("Could not initialize reader and writer.");
        e.printStackTrace();
    }
}
    
}
