package com.java;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Form extends JFrame {
JButton b;
JLabel l1,l2;
JTextField t1,t2;

Form()
{
	l1 = new JLabel("Name");
	l2 = new JLabel("Faculty");
	
	t1 = new JTextField(10);
	t2 = new JTextField(10);
	
	b= new JButton("Login");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b);
	
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
}
public static void main (String [] args)
{
	new Form();
}

}
