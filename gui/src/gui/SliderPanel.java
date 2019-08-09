package gui;

import java.awt.*;
import javax.swing.*;

public class SliderPanel extends JPanel{
	
	private int d=10;
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillOval(10, 10, d, d );
		g.setColor(Color.GREEN);
		g.fillOval(30, 30, d-40, d-40 );
		g.setColor(Color.RED);
		g.fillOval(50, 50, d-80, d-80 );
		g.setColor(Color.YELLOW);
		g.fillOval(70, 70, d-120, d-120);
		
		
	}
	public void setD(int Di){
		d = Di>=0 ? Di : 10;
		repaint();
	}
	
	public Dimension getPrefferedSize(){
		return new Dimension(350,350);
	}
	
	public Dimension getMinSize(){
		return getPrefferedSize();
	}

}
