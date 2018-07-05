// Programa Cliente UDP Multicast
// O cliente envia várias mensagens aos programas servidores.

import java.io.*;
import java.net.*;
import java.util.*;

class MulticastClient {

    public static void main(String args[]) throws Exception
    {
        BufferedReader inFromUser   = new BufferedReader( new InputStreamReader(System.in));
        byte[]         sendData     = new byte[1024];
        byte           ttl          = (byte) 1;    // time to live
        
        // ------------  criação do socket  ---------------------------------

        MulticastSocket clientSocket = new MulticastSocket( );
            
	// ------------  ligação a um grupo multicast  ----------------------
	InetAddress endereco = InetAddress.getByName("224.2.2.2");
	// clientSocket.joinGroup(endereco);


	// ------------  envio e recebimento de mensagens  ------------------


        for(int i = 0; i < 10; i++){
          String  sentence     =  " mensagem " + i + "\n";  
          sendData             = sentence.getBytes();
          DatagramPacket sendPacket   = new DatagramPacket(sendData, sendData.length, endereco, 1234);
          clientSocket.send(sendPacket,ttl);
        
          Thread.sleep(1000);
        }

	// -------------  desligamento do grupo multicast --------------------

        //clientSocket.leaveGroup(endereco);
        clientSocket.close( );
        

    }  // --------  fim do método main( )  ----------------
}   // -----------   fim da classe -------------------
