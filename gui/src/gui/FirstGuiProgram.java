package gui;

import javax.swing.JOptionPane;

public class FirstGuiProgram {

	public static void main(String[] args) {
		String x=JOptionPane.showInputDialog("Enter the First number");
		String y=JOptionPane.showInputDialog("Enter the Second number");
		
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		int sum=a+b;
		
		JOptionPane.showMessageDialog(null,"sum of numbers is "+sum, "Addition",JOptionPane.INFORMATION_MESSAGE);
	}

}
