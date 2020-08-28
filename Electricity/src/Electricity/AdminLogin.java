package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class AdminLogin extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2;
    JPanel p1,p2,p3,p4;
    AdminLogin(){
        super("Admin Login Page");
        
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);
        
        ImageIcon ic1 = new ImageIcon("icon/icons8-login-50.png");
        Image i1 = ic1.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        b1 = new JButton("Login", new ImageIcon(i1));
        
       
        b2 = new JButton("Cancel");
        
        b1.addActionListener(this);
        b2.addActionListener(this);


        ImageIcon ic3 = new ImageIcon("icon/login-png-1.png");
        Image i3 = ic3.getImage().getScaledInstance(128, 128,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        l3 = new JLabel(icc3);
        
        setLayout(new BorderLayout());
        
                
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        
        add(l3,BorderLayout.WEST);
        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(pf2);
        add(p2,BorderLayout.CENTER);
        
        p4.add(b1);
        p4.add(b2);
        add(p4,BorderLayout.SOUTH);
        
        p2.setBackground(Color.WHITE);
        p4.setBackground(Color.WHITE);
        
       
        setSize(440,250);
        setLocation(600,400);
        setVisible(true);
	}
    
    public void actionPerformed(ActionEvent ae){
    	try{
    		if(ae.getSource()==b1){
    			conn c1 = new conn();
                String a  = tf1.getText();
                String b=String.valueOf(pf2.getPassword());
                String q  = "select * from login where username = '"+a+"' and password = '"+b+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    new Project().setVisible(true);
                    this.setVisible(false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                }
    		}else{
    			System.exit(0);
    		}
    		
    	}catch(Exception e){
    		System.out.println(e);
    	}
    }
	
	public static void main(String[] args){
        new Login().setVisible(true);
    }
}

