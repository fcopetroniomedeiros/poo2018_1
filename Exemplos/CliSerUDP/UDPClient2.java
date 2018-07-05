
import java.io.*;
import java.net.*;
import java.util.*;

class UDPClient2 {

    public static void main(String args[]) throws Exception
    {
       // Timer tm = new Timer();
        BufferedReader inFromUser   = new BufferedReader( new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress    IPAddress    = InetAddress.getByName("localhost");
       
        byte[]         sendData     = new byte[1024];
        byte[]         receiveData  = new byte[1024];


        for(int i = 0; i < 3; i++){
          String  sentence     =  " apenas " + i + "\n" +  inFromUser.readLine();
          sendData             = sentence.getBytes();
          DatagramPacket sendPacket   = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
          clientSocket.send(sendPacket);
          //Thread.sleep(1000);
        }

    }
}