import java.io.*;
import java.net.*;

public class HttpServer {
    private static final int PORT = 8080;
    public static void main(String[] args) {

        try (
            ServerSocket httpSocket = new ServerSocket(PORT)
        ) {
            while (true) {
                Socket clientSocket = httpSocket.accept();

                System.out.printf("Client connected IP: %s, Port: %s\n", clientSocket.getInetAddress(), clientSocket.getLocalPort());

                HttpConnection conn = new HttpConnection(clientSocket);
                conn.run();
            }
        } catch (IOException e) {
            System.err.println("Could not start the Server Socket. Check if PORT in use.");
            e.printStackTrace();
        }   
    }
}
