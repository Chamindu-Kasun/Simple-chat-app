package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server running..");
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server socket created..");

        while (true) {
            //server is running forever
            Socket client = serverSocket.accept();

            //wait until a client connect
            System.out.println("Server accepted a client..");
            ClientHandler clientHandler = new ClientHandler(client);
            Thread thread = new Thread(clientHandler);
            thread.start();
        }
    }
}
