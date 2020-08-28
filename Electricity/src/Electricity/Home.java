package Electricity;

import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Home extends JFrame implements ActionListener{

	JButton b1,b2,b3;

	Home(){
		super("Login Page");
	
		b1 = new JButton("User Login");
        b2 = new JButton("Admin Login");
        b3= new JButton("Exit");
        
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
       
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setLayout(null);
        b1.setBounds(100, 50, 100, 30);
        b2.setBounds(230, 50, 120, 30);
        b3.setBounds(140,110,150,30);
        add(b1);
        add(b2);
        add(b3);
        
        //p1.setBounds(10,50,150,100);
        //add(p1);
		
		setSize(440,250);
		setLocation(600,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		try{
			if(ae.getSource()==b1){
				new UserLogin().setVisible(true);
				this.setVisible(false);
			}else if(ae.getSource()==b2){
				new AdminLogin().setVisible(true);
				this.setVisible(false);
			}else{
				System.exit(0);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String args[]){
		new Home().setVisible(true);
	}
}

