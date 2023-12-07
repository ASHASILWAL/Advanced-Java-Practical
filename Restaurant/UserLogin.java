package com.Restaurant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UserLogin extends JFrame {
	
	JDialog d1, d2;
	JButton b;
	JLabel l1, l2;
	JTextField t1, p;
	
	UserLogin()
	{
		l1 = new JLabel("Username : ");
		l2 = new JLabel("Password : ");
		b = new JButton("Login");
		t1 = new JTextField(10);
		p = new JPasswordField(10);
		//d1 = new JDialog(this,"Login Failed",true);
		//d2 = new JDialog(this,"Login Successfully",true);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			Menu m = new Menu();
			setVisible(true);
				dispose();
				
			}
		});
		
		add(l1);
		add(t1);
		add(l2);
		add(p);
		add(b);	
		//d1.add(l3);
		//d2.add( new JLabel ("Click button to continue."));
		//add(d1);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,250);
			   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new UserLogin();
	}

}
