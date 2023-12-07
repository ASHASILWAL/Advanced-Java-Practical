package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdapterEg extends MouseAdapter {
	
	JFrame f;
	
	public AdapterEg()
	{
		f=new JFrame("Adapter Demo");
	
		f.addMouseListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		System.out.println(e.getX()+","+e.getY());
		System.out.println("Hello");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AdapterEg();
	}

}
