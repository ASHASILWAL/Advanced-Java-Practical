package com.java;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MouseListenerEg extends JFrame implements MouseListener{
	JLabel l;

	public MouseListenerEg() {
	setTitle("MouseListener");
	addMouseListener(this);
	l= new JLabel("Hello");
	add(l);
	setLayout(new FlowLayout());
	setSize(400,400);

	setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("Mouse clicked");
	System.out.println("Mouse clicked");

	}

	public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("Mouse entered");
	System.out.println("Mouse entered");

	}

	public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("Mouse exited");
	System.out.println("Mouse exited");

	}

	public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("Mouse pressed");
	System.out.println("Mouse pressed");

	}

	public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("Mouse released");
	System.out.println("Mouse released");

	}
	public static void main(String[] args){
	new MouseListenerEg();
	}
	}






