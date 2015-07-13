package code_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DayTimeText {

	public static void main(String[] argv) {
		final short TIME_PORT = 80;
		String hostName;
		if (argv.length == 0)
		hostName = "localhost";
		else
		hostName = argv[0];
		try {
	
		Socket sock = new Socket(hostName, TIME_PORT);
		BufferedReader is = new BufferedReader(new
		InputStreamReader(sock.getInputStream( )));
		String remoteTime = is.readLine( );
		System.out.println("Time on " + hostName + " is " + remoteTime);
		} catch (IOException e) {
		System.err.println(e);
		}
	}

}
