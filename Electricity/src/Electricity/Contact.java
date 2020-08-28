package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Contact extends JFrame implements ActionListener{
	Contact(){
		JLabel l1 = new JLabel("Enter Your Query");
		setLayout(null);
		
		
		
		
		setSize(900,400);
		setLocation(600,100);
		setVisible(true);
		
	}
	
	public static void main(String args[]){
		new Contact().setVisible(true);
	}

}
