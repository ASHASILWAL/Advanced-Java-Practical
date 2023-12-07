package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCoordinateEg extends JFrame implements MouseListener{
	
	JPanel p;
	JFrame f;
	JLabel l;

	public MouseCoordinateEg()
	{
		p = new JPanel();
		l = new JLabel("Coordinates");
		
		p.add(l);
		p.addMouseListener(this);
		add(p);
		
//		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		l.setText("Mouse Clicked: "+e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String [] args){
		new MouseCoordinateEg();
	}
	
}
