package javaApplets;

import java.awt.*;
import javax.swing.*;
import java.math.*;


public class AppletSum extends JApplet{
	
	private double max;
	private double diff;
	
	public void init(){
		String fn = JOptionPane.showInputDialog("Enter your first number");
		String sn = JOptionPane.showInputDialog("Enter Second number");
	
		double n1=Double.parseDouble(fn);
		double n2=Double.parseDouble(sn);
		
		if(n1>=n2)
			max=n1;
		else
			max=n2;
		
		diff=Math.abs(n2-n1);
			
	}
	public void paint(Graphics g){
		super.paint(g);
		g.drawString(max+" is Greater by "+diff+" from other number", 30, 60);
	}

}
