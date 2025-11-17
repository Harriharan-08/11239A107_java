import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

        pw.println("Hello Server, this is the Client!");
        System.out.println("Message sent to server.");

        s.close();
    }
}
