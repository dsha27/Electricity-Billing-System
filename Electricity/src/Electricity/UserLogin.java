package Electricity;

import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserLogin extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JTextField tf1;
	JPasswordField pf1;
	JPanel p1,p2,p3;
	UserLogin(){
		super("User Login Page");
		
		ImageIcon ic1 = new ImageIcon("Icons/pop.png");
		Image i1 = ic1.getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT);
		ImageIcon ic2 = new ImageIcon(i1);
		l1 = new JLabel(ic2);
		
		l2 = new JLabel("UserName: ");
		tf1 = new JTextField(15);
		l3= new JLabel("Password: ");
		pf1 = new JPasswordField(15);
		
		p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		p1.add(l2);
		p1.add(tf1);
		p1.add(l3);
		p1.add(pf1);
		
		
		b1 = new JButton("Login");
		b2=new JButton("Register");
		b3 = new JButton("Cancel");
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		p3 = new JPanel();
		p3.setBackground(Color.WHITE);
		p3.add(l1);
		
		setLayout(new BorderLayout());
		add(p3,"West");
		add(p1,"Center");
		add(p2,"South");
		
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
	             String q  = "select * from userlogin where name = '"+a+"' and password = '"+b+"'";
				
				ResultSet rs = c1.s.executeQuery(q);
				
				if(rs.next()){
					new UserProject(a).setVisible(true);
					this.setVisible(false);
					
				}else if(tf1.getText().equals("") || String.valueOf(pf1.getPassword()).equals("")){
					JOptionPane.showMessageDialog(null,"Empty Field");
					this.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "Register First");
					this.setVisible(true);
				}
				
			}else if(ae.getSource()==b2){
				new UserRegister().setVisible(true);
				this.setVisible(false);
			}else{
				System.exit(0);
			}
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String args[]){
		new UserLogin().setVisible(true);
	}

}

