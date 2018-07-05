// classe PegaNome3


import java.net.*;   // importar as classe de rede

// Pega o proprio nome

public class PegaNome7 {

  public static void main(String[] args)  {

 	    try {
			InetAddress endereco =
			              InetAddress.getByName("www.uol.com.br");
           	System.out.println(endereco);
           	String nome = endereco.getHostName();
           	System.out.println(" O nome da maquina eh " + nome);
		}
		catch(UnknownHostException e) {
			System.out.println("Nao foi possivel achar o Host Local");

		}
  }

}