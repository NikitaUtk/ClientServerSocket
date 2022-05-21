import utk.Phone;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Phone phone = new Phone("127.0.0.1", 8000))
        {
            System.out.println("Connected to server");

            String request = "Kaliningrad";
            System.out.println("Request: " + request);
            phone.writeLine(request);

            String response = phone.readLine();
            System.out.println("Responce: " + response);
            phone.writeLine(response);

        } catch (IOException e){
            e.printStackTrace();        }
    }
}
