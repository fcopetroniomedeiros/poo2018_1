// classe Scanner
// Exemplo de de um Socket para "escanear" as portas de um computador


import java.net.*;
import java.io.*;


public class Scanner {

   //

   public static void main( String args[] )
   {
      String host = "200.221.2.45"; 
      //       host = "127.0.0.1;

     // for(int i = 79; i < 80; i++) {
         try {
               Socket s = new Socket(host, 20000);
               System.out.println( " Ha um servidor na porta " + 80 + " de " + host);
             }
         catch(UnknownHostException e) {
             System.err.println(e);
             //break;
         }
         catch(IOException e) {
             // caso nao haja servidor nesta porta
             System.err.print(21 + " ");
         }
    //  }

   }

}

// ---------  fim da classe Scanner


