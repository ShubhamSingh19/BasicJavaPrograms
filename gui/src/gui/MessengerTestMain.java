package gui;

import javax.swing.JFrame;

public class MessengerTestMain {

	public static void main(String[] args) {
		MessengerTest serverObject = new MessengerTest();
		serverObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverObject.networking();

	}

}
