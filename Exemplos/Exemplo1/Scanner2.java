// classe Scanner
// Exemplo de de um Socket para "escanear" as portas altas de um computador


import java.net.*;
import java.io.*;


public class Scanner2 {

   //

   public static void main( String args[] )
   {
      String host = "www.ifpb.edu.br";


      for(int i = 80; i < 81; i++) {
         try {
               Socket s = new Socket(host, i);
               System.out.println( " \nTem um servidor na porta alta " + i + " de " + host);
             }
         catch(UnknownHostException e) {
             System.err.println(e);
             break;
         }
         catch(IOException e) {
             // caso nao haja servidor nesta porta
             //System.err.print(i + " ");
         }
      }

   }

}

// ---------  fim da classe Scanner


