package com.company;

import java.io.IOException;

public class ClientChat {

    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();

        client.sendMessage("Hello from Client!!");
        client.sendMessage("How are you?");
        client.sendMessage("I am fine");
        client.sendMessage("Thank you");
        client.sendMessage("exit");

        System.out.println("Client finished execution");
    }
}
