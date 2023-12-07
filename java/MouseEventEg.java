package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventEg extends JFrame implements MouseListener {
	
	JLabel l;
	
	MouseEventEg()
	{
		addMouseListener(this);
		
		l= new JLabel("Hello");
		l.setBounds(20,50,100,20);
		add(l);
		setLayout(new FlowLayout());
		setVisible(true); 
		setSize(400,400);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventEg();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Clicked");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Exited");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Released");
	}

}
