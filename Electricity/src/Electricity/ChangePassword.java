package Electricity;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ChangePassword extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField tf1;
    JPasswordField pf1,pf2;
    JButton b1,b2;
    JPanel p1,p2,p3,p4;
    ChangePassword(){
        super("Login Page");
         
        l4=new JLabel("User Name");
        l1 = new JLabel("New Password");
        l2 = new JLabel("Confirm Password");
        tf1 = new JTextField(15);
        pf1 = new JPasswordField(15);
        pf2 = new JPasswordField(15);
        
        ImageIcon ic1 = new ImageIcon("icon/icons8-login-50.png");
        Image i1 = ic1.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        b1 = new JButton("OK", new ImageIcon(i1));
        
       
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
        p2.add(l4);
        p2.add(tf1);
        p2.add(l1);
        p2.add(pf1);
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
                String b=String.valueOf(pf1.getPassword());
                String c=String.valueOf(pf2.getPassword());
                
               
                String q  = "update userlogin set password = '"+b+"' where name = '"+a+"'" ;
                
                if(b.equals(c)){
                    c1.s.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Password changed");
                    setVisible(false);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Password doesn't match");
                    setVisible(true);
                }
    		}else{
    			System.exit(0);
    		}
    		
    	}catch(Exception e){
    		System.out.println(e);
    	}
    }
	
	public static void main(String[] args){
        new ChangePassword().setVisible(true);
    }
}
