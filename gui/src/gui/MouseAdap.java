package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdap extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private String s;
	 private JLabel status;
	 
	 public MouseAdap(){
		 super("Mouse Stimulation");
		 status=new JLabel("Bring your cursor In this region and click with different buttons");
		 add(status,BorderLayout.SOUTH);
		 getContentPane().setBackground(Color.LIGHT_GRAY);
		 
		 addMouseListener(new MouseClass());
	 }
	 private class MouseClass extends MouseAdapter{
		 public void mouseClicked(MouseEvent event){
			 s=String.format("you clicked %d time ",event.getClickCount());
			 
			 if(event.isMetaDown()){
				 s += "with right mouse button";
				 getContentPane().setBackground(Color.GREEN);
			 }	 
			 else if(event.isAltDown()){
				 s += "with middle mouse button";
				 getContentPane().setBackground(Color.YELLOW);
			 }	 
			 else{
				 s += "with left mouse button";
				 getContentPane().setBackground(Color.CYAN);
			 }
			 
			 status.setText(s);
		 }
	 }
}
