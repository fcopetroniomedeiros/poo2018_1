// Exemplo4
//Classe GetInfo
// como digitar: java GetInfo www.java.sun.com www.ufrn.br

import java.net.*;
import java.io.*;


public class GetInfo {

  public static void main(String[] args) {

      for (int i = 0; i < args.length; i++) {
          try {
			  Socket umSocket = new Socket(args[i],80);
			  System.out.println(" \n\nConectado a " + umSocket.getInetAddress()
			                       + " na porta " + umSocket.getPort()
			                       + "\n a partir da porta local " + umSocket.getLocalPort()
			                       + " \nda maquina local " + umSocket.getLocalAddress() );

		  } // --- fim do try

		  // ----- tratamento de erros ---------
		  catch(UnknownHostException e) {
			 System.err.println("UnknownHostException: Nao foi possivel achar " + args[i]);
          }
		  catch(SocketException e) {
			  System.err.println("SocketException: Nao foi possivel conectar a " + args[i]);
          }
          catch(IOException e) {
		  	  System.err.println(e);
          }
          // ---- fim do tratamento de erros


      }  // --- fim do for
  }  // --- fim do main

}   // ---- fim da classe