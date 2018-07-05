// classe ObtemNome


import java.net.*;   // importar as classe de rede


public class PegaNome1 {

  public static void main(String[] args)  {

 	    String nome = "216.58.222.68";


        try {
			InetAddress endereco = InetAddress.getByName(nome);
            System.out.println(endereco.getHostName());
		}
		catch(UnknownHostException e) {
			System.out.println("Nao foi possivel achar " + nome);

		}
  }

}