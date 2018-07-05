// classe PegaNome4


import java.net.*;   // importar as classe de rede

// Dado um numero Ip, retorno o nome da máquina

public class PegaNome4 {

  public static void main(String[] args)  {

 	    try {
			InetAddress endereco = InetAddress.getByName("216.58.222.68");
			String nome = endereco.getHostName();
           	System.out.println( " O Endereco da maquina eh: " + nome );
		}
		catch(Exception e) {
			System.out.println("Nao foi possivel obter o nome do Host");

		}
  }

}