// Programa de Scanner de portas com fechamento de Socket

import java.net.*;
import java.io.*;


public class PortScanner {
	public static void main(String[] args) {
		//String host = "arquivos.coinfo.cefetpb.edu.br"
		String host = "localhost";
		try {
		   InetAddress endereco = InetAddress.getByName(host);
		   for(int i=0;i <1023;i++) {
			   Socket conexao = null;
			   try {
				   conexao = new Socket(host,i);
				   System.out.println("Ha um servidor na porta " + i
				                       + " da maquina " + host);
			   }
			   catch (IOException e) { }
			   finally {
				   try {
					   if(conexao != null) conexao.close();
				   }
				   catch(IOException e) {  } // excecao do close()
			   } // -- fim do finally
		   } // --- fim do for

		} // -- fim do try do InetAddress
		catch(UnknownHostException e) { System.err.println(e);}
	} // --- fim do main

}  // ---- fim da classe