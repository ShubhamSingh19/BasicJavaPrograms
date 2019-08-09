package gui;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessengerClient extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private static String name;
	private JTextField textBar;
	private JTextArea chatWindow;
	private JLabel status;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Socket connection;
	private String message = "";
	private String serverIPAdress;
	private Font textBarFont = new Font("Serif",Font.PLAIN,18);
	private Font messageFont = new Font("Serif",Font.BOLD,18);
	private Font statusFont = new Font("Serif",Font.ITALIC,15);
	
	// Constructor..Appearance part.
	public MessengerClient(String host){
		
		 super("Khool Messenger (Client)");
		 getContentPane().setBackground(new Color(250,30,10));
		 serverIPAdress=host;
		 status= new JLabel();
		 status.setFont(new Font("Serif",Font.BOLD,20));
		 status.setText("  Offline");
		 add(status,BorderLayout.NORTH);
			
		 textBar = new JTextField("  You can write your text here when you are online");
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
		 name=JOptionPane.showInputDialog("  Enter your name!");
		 
	}
	
	//Networking...setting up Server and connections.
		public void networking(){
			try{
				connectToServer();
				setupStreams();
				whileChatting();
			}catch(EOFException eofException){
				updateStatusMessage("\n  "+name+" has terminated the connection");
			}catch(IOException ioException){
				ioException.printStackTrace();
			}finally{
				closeConnections();
			}
		}
		
		//connectToServer Method...Connecting to server
		private void connectToServer() throws IOException{
			updateMessage("  Attempting connection...\n");
			connection = new Socket(InetAddress.getByName(serverIPAdress),10747);
			updateStatusMessage("  Connected to "+ connection.getInetAddress().getHostName());
		}
		
		//setupStreams Method...get streams to communicate or transfer data.
		private void setupStreams() throws IOException{
			output=new ObjectOutputStream(connection.getOutputStream());
			output.flush();
			input= new ObjectInputStream(connection.getInputStream());
			updateStatusMessage("\n  Streams are good to go!\n");
			getContentPane().setBackground(Color.GREEN);
			status.setText("  Online");
			textBar.setText("");
		}
		
		//whileChatting Method...during having a conversation.
		private void whileChatting() throws IOException{
			ableToType(true);
			do{
				try{
					message=(String) input.readObject();
					updateMessage("\n  " + message);
				}catch(ClassNotFoundException classNotFoundException){
					updateStatusMessage("\n  Server sent unknown object of unknown format, not a text");
				}
			}while(!message.equals(name + " - END"));
		}
		
		// closingConnections Method...closing all streams and sockets.
		private void closeConnections(){
			updateStatusMessage("\n  Closing all connections...");
			ableToType(false);
			try{
				output.close();
				input.close();
				connection.close();
				getContentPane().setBackground(new Color(250,30,10));
				status.setText("  Offline");
				textBar.setText("  You can write your text here when you are online");
			}catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
		
		//sendMessage Method.
		private void sendMessage(String message){
			try{
				output.writeObject(name + " - " + message);
				output.flush();
				updateMessage("\n  " + name + " - " + message);
			}catch(IOException ioException){
				updateStatusMessage("\nSomething went wrong while Sending this message!");
			}
		}
		
		//UpdateMessage Method... Updates chat window.
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
