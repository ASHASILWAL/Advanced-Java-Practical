package com.java;


import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;
import javax.swing.*;

public class CreateNotepadEg extends JFrame {

	JScrollPane s;
	JButton b;
	JMenuBar me;
	JTextArea t;
	JMenu menu1, menu2, menu3, menu4, menu5;
	JMenuItem i1, i2, i3, i4, i5,i6,i7,i8,i9,i10;
	
	 CreateNotepadEg()
	{
		//s = new JScrollPane(t);
	    t = new JTextArea(50,50);
	    t.setBackground(Color.cyan);
		me = new JMenuBar();
		menu1 = new JMenu("File");
		menu2 = new JMenu("Edit");
		menu3 = new JMenu("Format");
		menu4 = new JMenu("View");
		menu5 = new JMenu("Help");
		i1 =new JMenuItem("New File"); 
		i2 =new JMenuItem("Open File");
		i3 =new JMenuItem("Cut");
		i4 =new JMenuItem("Copy");
		i5 =new JMenuItem("Paste");
		i6 =new JMenuItem("All Capital");
		i7 =new JMenuItem("All Small");
		i8 =new JMenuItem("Word Count");
		i9 =new JMenuItem("Character Count");
		i10 =new JMenuItem("About");
		
		setTitle("Notepad");
		menu1.add(i1);
		menu1.add(i2);
		menu2.add(i3);
		menu2.add(i4);
		menu2.add(i5);
		menu3.add(i6);
		menu3.add(i7);
		menu4.add(i8);
		menu4.add(i9);
		menu5.add(i10);
		
		
		me.add(menu1);
		me.add(menu2);
		me.add(menu3);
		me.add(menu4);
		me.add(menu5);
		add(t);
		
		
		setJMenuBar(me);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
	
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  CreateNotepadEg();
	}


}
