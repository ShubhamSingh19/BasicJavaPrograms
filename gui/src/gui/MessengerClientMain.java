package gui;

import javax.swing.JFrame;

public class MessengerClientMain {

	public static void main(String[] args) {
		MessengerClient clientObject = new MessengerClient("127.0.0.1");
		clientObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientObject.networking();
		
	}

}
