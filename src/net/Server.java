package net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args){
        ServerSocket server = null;
        boolean running = true;
        try{
            Socket client;
            server = new ServerSocket(1111);
            while (true){
                System.out.print("Waiting for connection...\n");
                client = server.accept();
                System.out.print("Client connected to: ");
                System.out.print(server.getLocalPort());
                System.out.print("\n");
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
