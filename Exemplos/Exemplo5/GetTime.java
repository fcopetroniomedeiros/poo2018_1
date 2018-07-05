
//Classe PegaTempo
// como digitar: java GetTime vision.poly.edu

import java.net.*;
import java.io.*;


public class GetTime {

	public static void main(String[] args) {
		String hostname;
		if (args.length > 0) {
	       hostname = args[0];
		}
		else {
		   hostname = "www.ifpb.edu.br";
		}
		try {
			Socket umSocket = new Socket(hostname,13);
			InputStream timeStream = umSocket.getInputStream( );
			StringBuffer time = new StringBuffer( );
			int c;
			while( (c = timeStream.read() ) != -1) {
				time.append( (char) c);
			}
			String timeString = time.toString().trim();
			System.out.println(" Sao " + timeString + " na maquina " + hostname);
		} // --- fim do try
		catch (UnknownHostException e) {
			System.err.println(e);
		}
		catch (IOException e) {
			System.err.println(e);
		}
	} // --- fim do main

} // --- fim da classe
