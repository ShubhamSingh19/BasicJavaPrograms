package gui;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Advance extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField item0;
	private JTextField item01;
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JButton left;
	private JButton centre;
	private JButton right;
	private JButton b;
	private JButton c;
	private JButton cc;
	private Color color=Color.WHITE;
	private Color color1;
	private JPasswordField item4;
	private JCheckBox cbB;
	private JCheckBox cbI;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private Font pf = new Font("Serif",Font.PLAIN,20);
	private Font bf = new Font("Serif",Font.BOLD,20);
	private Font itf = new Font("Serif",Font.ITALIC,20);;
	private Font bif = new Font("Serif",Font.BOLD + Font.ITALIC,20);
	private ButtonGroup group;
	private JLabel picture;
	private JComboBox<?> box;
	private JList<?> list;
	private JList<Object> Rlist;
	private JList<?> Llist;
	private JButton move;
	private FlowLayout layout;
	private Container container;
	
	
	
	private static String file[]={"r0.jpg","r1.jpg","r2.jpg","r3.jpg"};
	private Icon pics[]={new ImageIcon(getClass().getResource(file[0])),new ImageIcon(getClass().getResource(file[1])),
			new ImageIcon(getClass().getResource(file[2])),new ImageIcon(getClass().getResource(file[3]))};
	
	private static String cname[]={"Black","White","Blue","Red","Cyan","Green","yellow","Grey","Magneta"};
	private static Color colors[]={Color.BLACK,Color.WHITE,Color.BLUE,Color.RED,Color.CYAN,Color.GREEN,Color.YELLOW,Color.GRAY,Color.MAGENTA};
	
	private static String names[]={"Aman","Shubham","Manthan","Ritik","Safal","Mizo","Lala","Ronak"};
	
	public Advance(){
		super("Application");
		
		layout=new FlowLayout();
		container=getContentPane();
		setLayout(layout);
		
		left=new JButton("Left Alignment");
		add(left);
		left.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
		);
		
		centre=new JButton("Centre Alignment");
		add(centre);
		centre.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
		);
		
		right=new JButton("Right Alignment");
		add(right);
		right.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
		);
		
		item1=new JTextField("Enter your text",20);
		add(item1);
		
		item2= new JTextField(20);
		add(item2);
		
		item3=new JTextField("You can't erase me!!",20);
		item3.setEditable(false);
		add(item3);
		
		item4=new JPasswordField("DefaultPassword",20);
		add(item4);
		
		b=new JButton("CLick");
		add(b);
		
		Icon x = new ImageIcon(getClass().getResource("x.png"));
		Icon y = new ImageIcon(getClass().getResource("y.png"));
		
		c=new JButton("Music",x);
		c.setRolloverIcon(y);
		add(c);
		
		item0=new JTextField("Enter your text",17);
		item0.setFont(new Font("Serif",Font.PLAIN,20));
		add(item0);
		
		cbB=new JCheckBox("Bold");
		add(cbB);
		cbI=new JCheckBox("Italic");
		add(cbI);
		
		
		item01=new JTextField("Type Here!!",18);
		item01.setFont(new Font("Serif",Font.PLAIN,25));
		add(item01);
		
		pb= new JRadioButton("Plain",true);
		add(pb);
		bb= new JRadioButton("Bold",false);
		add(bb);
		ib= new JRadioButton("Italic",false);
		add(ib);
		bib= new JRadioButton("Bold and Italic",false);
		add(bib);
		
		group=new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		JComboBox<?> jComboBox = new JComboBox(file);
		box=jComboBox;
		add(box);
		
		box.addItemListener(
				new ItemListener(){
					public void itemStateChanged(ItemEvent e){
						if(e.getStateChange()==ItemEvent.SELECTED){
							picture.setIcon(pics[box.getSelectedIndex()]);
							picture.setToolTipText(file[box.getSelectedIndex()]);
						}		
					}
				}
				
				);
		picture=new JLabel(pics[0]);
		add(picture);
		picture.setToolTipText(file[box.getSelectedIndex()]);
		
		
		
		JList jList = new JList(cname);
		list=jList;
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent even){
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
				);
		
		Llist = new JList(names);
		Llist.setVisibleRowCount(4);
		Llist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(Llist));
		
		move=new JButton("Move =>");
		add(move);
		move.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Rlist.setListData(Llist.getSelectedValues());
					}
				}
				);
		
		Rlist = new JList<Object>();
		Rlist.setVisibleRowCount(4);
		Rlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		Rlist.setFixedCellWidth(75);
		Rlist.setFixedCellHeight(20);
		add(new JScrollPane(Rlist));
		
		cc=new JButton("Color chooser");
		add(cc,BorderLayout.SOUTH);
		cc.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						color1=color;
						color=JColorChooser.showDialog(null,"Pick your color",color);
						if (color==null)
							color=color1;
						getContentPane().setBackground(color);
					}
				}
	    
				
	    );
		
		
		AHandler AhandlerOb = new AHandler();
		item1.addActionListener(AhandlerOb);
		item2.addActionListener(AhandlerOb);
		item3.addActionListener(AhandlerOb);
		item4.addActionListener(AhandlerOb);
		item0.addActionListener(AhandlerOb);
		item01.addActionListener(AhandlerOb);
		c.addActionListener(AhandlerOb);	
		b.addActionListener(AhandlerOb);
		
		cbB.addItemListener(new IHandler());//new IHandler() is an object like AhandlerOb
		cbI.addItemListener(new IHandler());
		pb.addItemListener(new IHandler2(pf));
		bb.addItemListener(new IHandler2(bf));
		ib.addItemListener(new IHandler2(itf));
		bib.addItemListener(new IHandler2(bif));
		
	}
	
	private class AHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			String s="";
			
			if(e.getSource()==item0)
				s=String.format("Field 0 : %s", e.getActionCommand());
			
			else if(e.getSource()==item01)
				s=String.format("Field 01 : %s", e.getActionCommand());
			
			else if(e.getSource()==item1)
				s=String.format("Field 1 : %s", e.getActionCommand());
			
			else if(e.getSource()==item2)
				s=String.format("Field 2 : %s", e.getActionCommand());
			
			else if(e.getSource()==item3)
				s=String.format("Field 3 : %s", e.getActionCommand());
			
			else if(e.getSource()==item4)
				s=String.format("Field 4 : %s", e.getActionCommand());
			
			else if(e.getSource()==b)
				s=String.format("Button 1 : %s", e.getActionCommand());
			
			else if(e.getSource()==c)
				s=String.format("Button 2 : %s", e.getActionCommand());
			
			
			JOptionPane.showMessageDialog(null,s,"INFO",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private class IHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			Font font=null;
			if(cbB.isSelected() && cbI.isSelected())
				font = bif ;
				
			else if(cbB.isSelected())
				font = bf ;
				
			else if(cbI.isSelected())
				font = itf ;
				
			else
				font = pf ;
			
			item0.setFont(font);			
		}
	}
	
	private class IHandler2 implements ItemListener{
		Font font2=pf;
		private IHandler2(Font f){
			font2=f;
		}
		public void itemStateChanged(ItemEvent e){
			item01.setFont(font2);
		}
    }
}
