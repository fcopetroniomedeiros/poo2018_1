// Programa de Cliente2.java

import java.net.*;
import java.io.*;


public class cliente_tcp {

	// porta padrao
	public final static int DEFAULT_PORT = 1324;

	public static void main(String[] args) throws Exception {
	    int porta   =  DEFAULT_PORT;
        String host = "127.0.0.1";


             Socket s = new Socket(host,porta);

			 OutputStream  saida1 = s.getOutputStream();
			 ObjectOutputStream saida = new ObjectOutputStream(saida1);


			for (int i=1; i<=10; i++) {
				String m = new String ("teste aula: " + i);
				System.out.println(m);
		     	saida.writeObject(m);
				saida.flush();

				Thread.sleep (1000);
			}//fim do for

			ObjectInputStream entrada = new ObjectInputStream(s.getInputStream());
			String mensagem = (String) entrada.readObject();
			System.out.println(mensagem);

			 saida.close();



	} // --- fim do main

}  // ---- fim da classe