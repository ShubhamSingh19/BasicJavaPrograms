package gui;

import javax.swing.JFrame;

public class CalciMain {
	public static void main(String[] args){
		Calci ob = new Calci();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setSize(180,275);
		ob.setVisible(true);
	}

}
