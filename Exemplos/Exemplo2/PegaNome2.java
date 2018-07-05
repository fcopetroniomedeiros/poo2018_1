// classe PegaNome2


import java.net.*;   // importar as classe de rede


public class PegaNome2 {

  public static void main(String[] args)  {

 	    String nome = "drive.google.com";

        try {
			 InetAddress[] enderecos =
			              InetAddress.getAllByName(nome);
             for(int i = 0; i < enderecos.length; i++)
              {
				System.out.println(enderecos[i].getHostName());
			  }
		}
		catch(UnknownHostException e) {
			System.out.println("Nao foi possivel achar " + nome);

		}
  }

}