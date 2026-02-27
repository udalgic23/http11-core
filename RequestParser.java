import java.io.*;
import java.util.*;

public class RequestParser {
    BufferedReader in;
    HttpRequest request;
    String firstLine;
    Map<String, String> headers = new HashMap<String, String>();
    String Body = "";

    RequestParser (BufferedReader in) {
        this.in = in;
    }

    // TODO: Do not use string parsing. Parse by reading raw bytes. RFC 9112-2.2
    public HttpRequest parseRequestAsBytes() {
        try {
            firstLine = in.readLine();
            
            String line = in.readLine();
            while (line != " ") {

            }

        } catch (IOException e) {
            System.err.println("Could not read from socket.");
            e.printStackTrace();
        }
        
    }

}
