package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCoordinateAdaptorEg extends MouseAdapter {

	JPanel p;
	JFrame f;
	JLabel l;

	public  MouseCoordinateAdaptorEg ()
	{
		f= new JFrame();
		p = new JPanel();
		l = new JLabel("Click Here");
		
		p.add(l);
		p.addMouseListener(this);
		f.add(p);
		
//		setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(400,400);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		l.setText("Mouse clicked at coordinate : "+e.getX()+","+e.getY());
		
	}

		public static void main(String [] e){
		new MouseCoordinateAdaptorEg();
	}
	
}

