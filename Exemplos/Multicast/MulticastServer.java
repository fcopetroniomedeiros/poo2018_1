// Programa Servidor UDP Multicast
// O Servidor recebe v�rias  mensagens de um programa cliente multicast.

import java.io.*;
import java.net.*;
import java.util.*;

class MulticastServer {

    public static void main(String args[]) throws Exception
    {
        BufferedReader inFromUser   = new BufferedReader( new InputStreamReader(System.in));
        byte[]         receiveData     = new byte[1024];
        byte           ttl          = (byte) 1;    // time to live
        
        // ------------  cria��o do socket  ---------------------------------

        MulticastSocket serverSocket = new MulticastSocket(1234);
            
	// ------------  liga��o a um grupo multicast  ----------------------
	InetAddress endereco = InetAddress.getByName("224.2.2.2");
        serverSocket.joinGroup(endereco);


	// ------------  envio e recebimento de mensagens  ------------------


        while(true) {
              DatagramPacket receivePacket   = new DatagramPacket(receiveData, receiveData.length);
              serverSocket.receive(receivePacket);
              String         sentence     = new String( receivePacket.getData() );
              System.out.println(sentence);
            
          
        }  // ----- fim do while  ------------

	// -------------  desligamento do grupo multicast --------------------
	// if(serverSocket != null) {
	// serverSocket.leaveGroup(endereco);
	// serverSocket.close( );
	//}
        

    }  // --------  fim do m�todo main( )  ----------------
}   // -----------   fim da classe -------------------
