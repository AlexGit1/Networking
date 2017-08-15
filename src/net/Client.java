package net;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try{
            Socket clientSocket = new Socket("127.0.0.1" ,1111);
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
