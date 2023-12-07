package com.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SubAnnoymousEg extends JFrame {

	JButton b;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	SubAnnoymousEg()
	{
		try{
			
		l1 = new JLabel("Num1 :");
		l2 = new JLabel("Num2 :");
		l3 = new JLabel("Result :");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		b = new JButton("SUBTRACT");

		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int num1, num2, result;
				num1 = Integer.parseInt(t1.getText());
				num2 = Integer.parseInt(t2.getText());
				result = num1 - num2;
				l3.setText(result + "");
			}
		});
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		
	}catch(Exception e1){
		System.out.println(e1.getMessage());
	}
	}
	public static void main(String [] args)
	{
	  new SubAnnoymousEg();
	}

	
}
