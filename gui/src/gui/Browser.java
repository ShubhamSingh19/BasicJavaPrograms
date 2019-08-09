package gui;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Browser extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton back;
	private JButton reload;
	private JButton forward;
	private JButton home;
	private JTextField bar;
	private JTextField sbar;
	private JEditorPane window;
	private JLabel status;
	private Font pf = new Font("Serif",Font.PLAIN,17);
	
	public Browser(){
		super("Khool Browser");
		setLayout(new FlowLayout());
		
		back=new JButton("◄");
		back.setToolTipText("Back");
		add(back);
		back.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						
					}
				}
		);
		forward=new JButton("►");
		forward.setToolTipText("Forwad");
		add(forward);
		forward.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						
					}
				}
		);
		reload=new JButton("֍");
		reload.setToolTipText("Reload");
		add(reload);
		reload.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						
					}
				}
		);
		home=new JButton("⌂");
		home.setToolTipText("Home");
		add(home);
		home.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						loadPage("http://www.google.com");
					}
				}
		);
		
		bar= new JTextField("Enter the URL",100);
		bar.setFont(pf);
		bar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						loadPage(event.getActionCommand());
					}
				}
		);
		add(bar,BorderLayout.NORTH);
		getContentPane().setBackground(Color.GRAY);
		

		sbar= new JTextField("Search",20);
		sbar.setFont(pf);
		sbar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						loadPage(String.format("http://www.%s.com",event.getActionCommand()));
					}
				}
		);
		add(sbar,BorderLayout.NORTH);
		
		window= new JEditorPane();
		window.setEditable(false);
		window.setBackground(Color.LIGHT_GRAY);
		window.setSize(MAXIMIZED_HORIZ, MAXIMIZED_VERT);
		window.addHyperlinkListener(
				new HyperlinkListener(){
					public void hyperlinkUpdate(HyperlinkEvent event){
						if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
							loadPage(event.getURL().toString());
					}
				}
		);
		add(new JScrollPane(window),BorderLayout.CENTER);
		
		status = new JLabel();
		add(status,BorderLayout.SOUTH);
		
		
		setSize(1920,1070);
		setVisible(true);
		
	}
	
	public void loadPage(String userText){
		try{
			window.setPage(userText);
			status.setText(userText);
			bar.setText(userText);
		}
		catch(Exception e){
			status.setText("Wrong Address!! Try again with proper address.");
			window.setFont(new Font("Serif",Font.BOLD,40));
			window.setText("Oops! Something wrong happened.");
			
			reload=new JButton("Reload");
			reload.setToolTipText("Reload the present URL again");
			add(reload);
			reload.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent event){
							
						}
					}
			);
		}
	}
	
}
