package net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try{
            Socket client;
            ServerSocket server = new ServerSocket(1111);
            System.out.print(server.getLocalPort());
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
