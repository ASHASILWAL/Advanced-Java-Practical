package com.java;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstLab {
	public static void main(String[] args)
	{
		JFrame f = new JFrame("new frame");
		JButton b = new JButton("click me");
		
		b.setBounds(50,90,100,60);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
	
		

}
	}
