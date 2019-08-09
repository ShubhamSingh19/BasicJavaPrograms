package gui;

import javax.swing.JFrame;

public class MessengerServerMain {

	public static void main(String[] args) {
		MessengerServer serverObject = new MessengerServer();
		serverObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverObject.networking();

	}

}
