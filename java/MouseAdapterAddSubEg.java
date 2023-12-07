package com.java;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseAdapterAddSubEg extends MouseAdapter{
JFrame f;
JLabel l1, l2, l3;
JTextField t1,t2;

public MouseAdapterAddSubEg(){
	  f = new JFrame();
	  l1 = new JLabel("Num 1");
	  t1 = new JTextField(10);
	  
	  l2 = new JLabel("Num 2");
	  t2 = new JTextField(10);
	  l3 = new JLabel("Result");
	  
	  f.add(l1);
	  f.add(t1);
	  f.add(l2);
	  f.add(t2);
	  f.add(l3);
	  t1.addMouseListener(this);
	  t2.addMouseListener(this);
	  l3.addMouseListener(this);
	  f.setLayout(new FlowLayout());
	  f.setSize(400,400);
	  f.setVisible(true);
	  
}
public void mousePressed(MouseEvent e){
	  try{
		  int num1 = Integer.parseInt(t1.getText());
	        int num2 = Integer.parseInt(t2.getText());
	      
	            int sum = num1 + num2;
	         
	            l3.setText("Sum : " + sum);
	            l3.setForeground(Color.RED);
	            System.out.println("Mouse Pressed");
	       
	  }catch(Exception ex){
		  System.out.println(ex.getMessage());
	  }
}
public void mouseReleased(MouseEvent e) {
	  
	  try{
		  int num1 = Integer.parseInt(t1.getText());
	        int num2 = Integer.parseInt(t2.getText());
	      
	            int sub = num1 - num2;
	         
	            l3.setText("Difference : " + sub);
	            l3.setForeground(Color.BLUE);
	            System.out.println("Mouse released");
	       
	  }catch(Exception ex){
		  System.out.println(ex.getMessage());
	  }
     
}

public static void main(String[] args){
	new MouseAdapterAddSubEg();
}


}
