package Electricity;

import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Try extends JFrame{
	static JFrame f; 
	  
    // label to diaplay text 
    static JLabel l; 
  
    // main class 
    public static void main(String[] args) 
    { 
    	boolean resizable = true, closable = true, maximizable = true,
    			iconifiable = true;
        // create a new frame to 
        f = new JFrame("frame"); 
  
        // create a internal frame 
        JInternalFrame in = new JInternalFrame("Frame title3", resizable);
		in.setBounds(100,100,100,100); 
  
        // set the title of the frame 
        in.setTitle("InternalFrame"); 
  
        // create a Button 
        JButton b = new JButton("button"); 
  
        // create a label to display text 
        l = new JLabel("This is a JInternal Frame  "); 
  
        // create a panel 
        JPanel p = new JPanel(); 
  
        // add label and button to panel 
        p.add(l); 
        p.add(b); 
  
        // set visibility internal frame 
       
        in.setVisible(true); 
  
        // add panel to internal frame 
        in.add(p); 
  
        // add internal frame to frame 
        f.add(in); 
  
        // set the size of frame 
        f.setSize(1300, 300); 
        f.setVisible(true);

    } 
} 


