package com.Restaurant;
import javax.swing.*;

import com.java.JTableEg;

import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

	JFrame f;    
    Menu(){   
    	setTitle("Select Food Item");
    f=new JFrame();    
    String value[][]={ 
    		{"Chowmin","120"},    
    		{"Momo","150"}, 
    		{"Pizza","650"}, 
    		{"Burger","250"}, 
                          };    
    String col[]={"Food Item", "Price(Npr)"};         
    JTable t=new JTable(value,col);    
    t.setBounds(30,40,200,300);          
    JScrollPane s=new JScrollPane(t);    
    add(s);  
    
    
    setSize(300,400);    
    setVisible(true);    
}     
public static void main(String[] args) {    
    new Menu();    
}    

}
