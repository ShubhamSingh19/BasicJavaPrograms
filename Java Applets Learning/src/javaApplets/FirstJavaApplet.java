package javaApplets;

import java.awt.*;
import javax.swing.*;

public class FirstJavaApplet extends JApplet{
	public void paint(Graphics g){
		super.paint(g);
		
		g.setColor(Color.CYAN);
		g.fillRect(40, 40, 100, 100);
		g.setColor(Color.RED);
		g.drawString("Hey there!!", 50, 70);
		
	}

}
