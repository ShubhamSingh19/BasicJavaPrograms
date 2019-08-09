package javaApplets;

import java.util.*;
import java.net.*;
import java.awt.*;
import java.applet.*;
import javax.swing.event.*;
import javax.swing.*;


public class WebNavigation extends JApplet {
	private JLabel p;
	private JList list;
	private HashMap<String,URL> webInfo;
	private ArrayList<String> titles;
	
	public void init(){
		
		p=new JLabel("Choose your Porn website");
		add(p,BorderLayout.NORTH);
		
		titles= new ArrayList<String>();
		webInfo= new HashMap<String,URL>();
		
		getHTMLInfo();
		
		list = new JList(titles.toArray());
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent event){
						Object ob = list.getSelectedValue();
						URL path = webInfo.get(ob);
						AppletContext browser = getAppletContext();
						browser.showDocument(path);
					}
				}	
		);
		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list), BorderLayout.CENTER);
		
	}
	public void getHTMLInfo(){
		String name;
		String link;
		URL url;
		int count=0;
		
		name=getParameter("title"+count);
		while(name!=null){
			link=getParameter("address"+count);
			try{
				url=new URL(link);
				webInfo.put(name, url);
				titles.add(name);
			}
			catch(MalformedURLException urlException){
				urlException.printStackTrace();
			}
			++count;
			name=getParameter("title"+count);
		}
		
	}
	
}
