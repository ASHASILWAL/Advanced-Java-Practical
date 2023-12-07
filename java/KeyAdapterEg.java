package com.java;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyAdapterEg extends KeyAdapter {

	JFrame f;
	JTextArea a;
	
	KeyAdapterEg(){
		 f = new JFrame();
		 a = new JTextArea(10,20);
		
	     f.setLayout(new FlowLayout());
		 f.setSize(400,400);
		 f.setVisible(true);
		 a.addKeyListener(this);
		 f.add(a);
		
	}
	
	public static void main(String[] args){
		new KeyAdapterEg();
	}
	
	 public void keyPressed(KeyEvent a){
		 System.out.println("Key pressed");
	 }
	 public void keyReleased(KeyEvent a){
		 System.out.println("Key released");
	 }




}
