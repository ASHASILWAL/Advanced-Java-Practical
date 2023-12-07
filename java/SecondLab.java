package com.java;
import javax.swing.JFrame;
import javax.swing.JButton; 

public class SecondLab extends JFrame {
	
	JFrame f;
	//JButton b;
	
	SecondLab()
	{
		JButton b = new JButton("Click Me");
		//b = new JButton ("click me");
		b.setBounds(40,90,100,50);
		add(b);
		setLayout(null);
		setVisible(true);
		setSize(250,250);
		
	}
	
	public static void main(String [] args)
	{
		new SecondLab();
	}

}
