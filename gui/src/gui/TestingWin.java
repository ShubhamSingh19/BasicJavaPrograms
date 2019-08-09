package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestingWin extends JFrame {
	private JLabel item1;
	public TestingWin(){
		super("NIKE");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Just DO It!!");
		item1.setToolTipText("Nike commercial.");
		add(item1);
		
	}

}
