package com.java;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyListenerEg extends JFrame implements KeyListener {
	
JTextArea a;
	
	public KeyListenerEg() {
		a = new JTextArea();
		
		add(a);
		a.addKeyListener(this);
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String[] args){
		new KeyListenerEg();
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
//		a.setText("key pressed");
		System.out.println("Key Pressed");
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Released");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Typed");
		
	}


}
