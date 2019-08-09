package gui;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calci extends JFrame{
	private JTextField t;
	private JButton b[]=new JButton[18];
	
	public Calci(){
		super("Calculator");
		setLayout(new FlowLayout());
		
		t=new JTextField(14);
		add(t);
		
		for(int i=1; i<10; i++){
			b[i]=new JButton(String.format("%s",i));
			add(b[i]);
		}
		
		b[10]=new JButton("%");
		add(b[10]);
		b[0]=new JButton("0");
		add(b[0]);
		b[11]=new JButton("C");
		add(b[11]);
		b[12]=new JButton("+");
		add(b[12]);
		b[13]=new JButton("-");
		add(b[13]);
		b[14]=new JButton("*");
		add(b[14]);
		b[15]=new JButton("Del.");
		add(b[15]);
		b[16]=new JButton(".");
		add(b[16]);
		b[17]=new JButton("=");
		add(b[17]);
		
	}



}
