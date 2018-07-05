// classe Scanner
// Exemplo de de um Socket para "escanear" as portas baixas de um computador


import java.net.*;
import java.io.*;


public class Scanner {

   //

   public static void main( String args[] )
   {
      String host = "localhost";
      //String host = "www.uol.com.br";

     try {
          InetAddress endereco = InetAddress.getByName(host);
          for(int i = 1; i < 1024; i++) {
		      try {
			        Socket s = new Socket(endereco, i);
                    System.out.println( " \nHa um servidor na porta " + i + " de " + host);
              }
              catch(IOException e) {
			               // caso nao haja servidor nesta porta
			               //System.err.print(i + " ");
              }
	      } // -- fim do for
	 } // --- fim do try
	 catch(UnknownHostException e) {
             System.err.println(e);
     }
   } // --- fim do main
}  // --- fim da classe


