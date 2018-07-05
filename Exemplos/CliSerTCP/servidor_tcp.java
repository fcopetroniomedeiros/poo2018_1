// Programa de Servidor2.java
// Servidor que identifica o cliente que se conectou a ele.
// E

import java.net.*;
import java.io.*;


public class servidor_tcp  {

	// porta padrao
	public final static int DEFAULT_PORT = 1324;

	public static void main(String[] args) throws Exception {
	    int porta =  DEFAULT_PORT;

			ServerSocket servidor = new ServerSocket(porta,5);
			System.out.println("----------------------------------------");
			System.out.println("Servidor criado na porta " + porta);
			Socket        conexao = null;
			int numero = 0; // numeracao da conexao


			while(true) {
				InetAddress endereco_remoto;
				int         porta_remota;

					System.out.println("Servidor esperando conexao na porta " + porta);
					conexao = servidor.accept( ); // esperando uma conexao
					numero++; // incrementa numero de conexao
					ObjectInputStream entrada = new ObjectInputStream (conexao.getInputStream());
					Thread.sleep(5000);


				for (int i=1; i<=10; i++) {
					System.out.println("Servidor recebeu conexao. Numero da conexao: " + numero);

					endereco_remoto = conexao.getInetAddress();
					porta_remota    = conexao.getPort();

					System.out.println("Nome da maquina remota: " + endereco_remoto.getHostName());
					System.out.println("IP da maquina remota: " + endereco_remoto.getHostAddress());
					System.out.println("Porta maquina remota: " + porta_remota);

					

                    System.out.println((String)entrada.readObject());

			}//fim do for

				    ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
					//entrada = (String) conexao();

					saida.writeObject("Servidor: estou localizado na maquina " + servidor.getInetAddress());
					saida.flush();
					System.out.println("teste");

					conexao.close();
		}


	} // --- fim do main

}  // ---- fim da classe