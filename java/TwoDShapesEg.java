package com.java;
import javax.swing.*;
import java.awt.*;

public class TwoDShapesEg extends JFrame {
	
	MyPanel panel; 
	
	TwoDShapesEg()
	{
		panel = new MyPanel();
		add(panel);
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TwoDShapesEg();

	}
	

}

 class MyPanel extends JPanel 
{

	public MyPanel()
	{
		
	}
	
	public void paint(Graphics g){
		g.drawLine(0, 0, 400, 400);
		g.drawString("Hello", 40, 40);
		g.fillRect(130, 30, 100, 80);
		g.drawOval(30, 130, 50, 60);
		g.fillOval(130, 130, 50, 60);
		g.drawArc(30, 200, 40, 50, 90, 60);
		g.fillArc(30, 130, 40, 50, 180, 40);
	}
	
}
