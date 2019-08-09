package gui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Mouse extends JFrame {
	private JPanel pannel;
	private JLabel status;
	
	public Mouse(){
		super("Mouse Panel");
		
		pannel=new JPanel();
		pannel.setBackground(Color.LIGHT_GRAY);
		add(pannel,BorderLayout.CENTER);
	
		status = new JLabel("DO Something!!");
		add(status,BorderLayout.SOUTH);
		
		MHandler hob= new MHandler();
		pannel.addMouseListener(hob);
		pannel.addMouseMotionListener(hob);
	}
	private class MHandler implements MouseListener,MouseMotionListener{
		public void mouseClicked(MouseEvent event){
			status.setText(String.format("you clicked at (%d,%d)",event.getX(),event.getY()));
		}
		public void mousePressed(MouseEvent event){
			status.setText(String.format("you pressed at (%d,%d)",event.getX(),event.getY()));
			pannel.setBackground(Color.GREEN);
		}
		public void mouseReleased(MouseEvent event){
			status.setText(String.format("Mouse released at (%d,%d)",event.getX(),event.getY()));
			pannel.setBackground(Color.CYAN);
		}
		public void mouseEntered(MouseEvent event){
			status.setText("Mouse cursor Entered!!");
		    pannel.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent event){
			status.setText(String.format("Mouse cursor exits!! Last position was (%d,%d)",event.getX(),event.getY()));
			pannel.setBackground(Color.LIGHT_GRAY);
		}
		public void mouseDragged(MouseEvent event){
			status.setText(String.format("You are Dragging the mouse!! Position (%d,%d)",event.getX(),event.getY()));
			pannel.setBackground(Color.RED);
		}
		public void mouseMoved(MouseEvent event){
			status.setText(String.format("Mouse cursor Position (%d,%d)",event.getX(),event.getY()));
			pannel.setBackground(Color.CYAN);
		}
	}
}
