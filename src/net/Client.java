package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        try{
            Socket clientSocket = new Socket("127.0.0.1" ,1111);
            while (true){
                ///////////////////////////////////////////////////////////////////////////
                DataInputStream backin = new DataInputStream(clientSocket.getInputStream());
                System.out.println(backin.readUTF());
                ///////////////////////////////////////////////////////////////////////////
                System.out.print("Enter an input: ");
                String inpString = keyboard.nextLine();
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                out.writeUTF(inpString);
                out.flush();
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
