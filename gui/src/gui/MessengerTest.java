package gui;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessengerTest extends JFrame{
	private static final long serialVersionUID = 1L;
	private static String name;
	private JTextField textBar;
	private JTextArea chatWindow;
	private JLabel status; 
	private Socket connection;
	private ServerSocket server;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Font textBarFont = new Font("Serif",Font.PLAIN,18);
	private Font messageFont = new Font("Serif",Font.BOLD,18);
	private Font statusFont = new Font("Serif",Font.ITALIC,15);
	
	//constructor..Appearance part
	public MessengerTest(){
		
		super("Khool Messenger (Server)");
		getContentPane().setBackground(new Color(250,30,10));
		status= new JLabel();
		status.setFont(new Font("Serif",Font.BOLD,20));
		status.setText("  Offline");
		add(status,BorderLayout.NORTH);
		
		textBar = new JTextField("You can write your text here when you are online");
		textBar.setBackground(new Color(10,252,220));
		textBar.setEditable(false);
		textBar.setFont(textBarFont);
		textBar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						sendMessage(event.getActionCommand());
						textBar.setText("");
						
					}
				}
		);
		add(textBar,BorderLayout.SOUTH);
		chatWindow = new JTextArea();
		chatWindow.setEditable(false);
		chatWindow.setBackground(new Color(10,220,160));
		add(new JScrollPane(chatWindow),BorderLayout.CENTER);
		
		setSize(600,900);
		setVisible(true);
		name=JOptionPane.showInputDialog("Enter your name!");
		
	}
	
	
	//Networking...setting up Server and connections.
	public void networking(){
		try{
			server = new ServerSocket(10747,100);
			try{
				while(true){
					waitForConnection();
					setupStreams();
					whileChatting();
				}
			}catch(EOFException eofException){
				updateStatusMessage("\n" + name + " has ended the connection!!");
			}finally{
				closeConnections();
			}
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
	//waitForConnection Method
	private void waitForConnection() throws IOException{
		updateStatusMessage("Waiting For Someone to Connect....");
		connection=server.accept();
		updateStatusMessage("\nNow you are connected to "+connection.getInetAddress().getHostName());
	}
	
	//setupStreams Method...get streams to communicate or transfer data.
	private void setupStreams() throws IOException{
		output=new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input=new ObjectInputStream(connection.getInputStream());
		getContentPane().setBackground(Color.GREEN);
		status.setText("  Online");
		updateStatusMessage("\nStreams  are now setup");
		textBar.setText("");
	}
	
	//whileChatting Method...during having a conversation.
	private void whileChatting() throws IOException{
		String message = "you are now connected!";
		sendMessage(message);
		ableToType(true);
		do{
			try{
				message=(String) input.readObject();
				updateMessage("\n" + message);
			}catch(ClassNotFoundException classNotFoundException){
				updateStatusMessage("\nUser sent unknown object of unknown format, not a text");
			}
		}while(!message.equalsIgnoreCase(name + " - END"));
	}
	
	// close all connections(socket and streams) after done with chat.
	private void closeConnections(){
		updateStatusMessage("\nClosing connections...");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
			getContentPane().setBackground(new Color(250,30,10));
			status.setText("  Offline");
			textBar.setText("You can write your text here when you are online");
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	// Send Message to Client
	private void sendMessage(String message){
		try{
			output.writeObject(name + " - " + message);
			output.flush();
			updateMessage("\n" + name + " - " + message);
		}catch(IOException ioException){
			updateStatusMessage("\nERROR! Can't send this message!");
		}
	}
	
	//Update chat window
	private void updateMessage(final String text){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						chatWindow.setFont(messageFont);
						chatWindow.setEditable(true);
						chatWindow.append(text);
						chatWindow.setEditable(false);
					}
				}
	    );
	}
	
	//Update Status Message
	private void updateStatusMessage(final String text){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						chatWindow.setFont(statusFont);
						chatWindow.setEditable(true);
						chatWindow.append(text);
						chatWindow.setEditable(false);
					}
				}
	    );
	}
	
	//allows user to type in their text bar
	private void ableToType(final boolean tof){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						 textBar.setEditable(tof);
					}
				}
	    );
	}

}
