package gui;

import javax.swing.JFrame;

public class AnimationsMain {

	public static void main(String[] args) {
		JFrame j = new JFrame("Title");
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Animation a = new Animation();
		j.add(a);
		j.setSize(1000, 1000);
		j.setVisible(true);

	}

}
