package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderFrame extends JFrame {
	
	private SliderPanel object;
	private JSlider s;
	public SliderFrame(){
		super("Slide it!!");
		
		object = new SliderPanel();
		object.setBackground(Color.CYAN);
		s = new JSlider(SwingConstants.HORIZONTAL,0,400,10);
		s.setMajorTickSpacing(10);
		s.setMinorTickSpacing(2);
		s.setPaintTicks(true);
		
		
		s.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent event){
						object.setD(s.getValue());
					}
				}
		);
		
		add(s,BorderLayout.SOUTH);
		add(object,BorderLayout.CENTER);
	}
}
