package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Animation extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.yellow);
		
		g.setColor(new Color(250,20,100));
		g.fillRect(100, 500, 100, 100);
		
		g.setColor(Color.CYAN);
		g.fill3DRect(300, 500, 200, 100, true);
		
		g.setColor(Color.GREEN);
		g.fillOval(0, 0, 200, 100);
		
		g.setColor(Color.RED);
		g.drawString("LOLWA", 200, 400);
		
		
	}

}
