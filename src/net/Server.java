package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

public class Server {

    public static void main(String[] args){
        ServerSocket server = null;
        boolean running = true;
        try{
            Socket client;
            server = new ServerSocket(1111);
            while (running == true){
                System.out.print("Waiting for connection...\n");
                client = server.accept();
                System.out.print("Client connected to: ");
                System.out.print(server.getLocalPort());
                System.out.print("\n");
                ///////////////////////////////////////////////////////////////////////
                DataOutputStream back = new DataOutputStream(client.getOutputStream());
                back.writeUTF("test");
                back.flush();
                ///////////////////////////////////////////////////////////////////////
                DataInputStream inp = new DataInputStream(client.getInputStream());
                String data = inp.readUTF();

                if (Objects.equals(data ,"exit")){
                    running = false;
                }
                else {
                    System.out.print(data);
                    System.out.print("\nfail\n");
                }
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
