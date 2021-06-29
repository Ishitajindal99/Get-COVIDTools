/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class Contact extends JFrame implements ActionListener{
    JLabel NewLabel2,NewLabel3;
    Contact(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);//extends tha frame to full size
        setLayout(null);
        setUndecorated(true);
        setBounds(0,70,1365,1000);
        
        //Adding first panel 
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(131,193,233));
        p1.setLocation(0,0);
        p1.setSize(1365,150);
        add(p1);
        
        
         //Heading label
        JLabel NewLabel1 = new JLabel("Contact Us");
        NewLabel1.setForeground(Color.white);
        NewLabel1.setFont(new Font("SAN_SERIF", Font.BOLD, 50));
	NewLabel1.setBounds(520,50,1100,100); 
        p1.add(NewLabel1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GetCovidTools/Icons/kuva-uutiseen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950,1050,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 51, 1365, 650); 
        add(NewLabel);
        
        NewLabel3 = new JLabel("Get In Touch And Let Us Know How We Can Help");
        NewLabel3.setForeground(Color.darkGray);
        NewLabel3.setFont(new Font("SAN_SERIF", Font.BOLD, 30));
	NewLabel3.setBounds(320,90,1100,100); 
        NewLabel.add(NewLabel3);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.white);
        p2.setLocation(430,230);
        p2.setSize(460,240);
        NewLabel.add(p2);
        
        NewLabel2 = new JLabel("Contact Support ->");
        NewLabel2.setForeground(new Color(131,193,233));
        NewLabel2.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
	NewLabel2.setBounds(120,10,200,100); 
        p2.add(NewLabel2);
        
        JTextArea area2=new JTextArea("Phone\n+919692799272\n\nE-Mail ID\nishita4199@gmail.com");  
        area2.setBounds(120,110,270,150);
        area2.setLayout(new FlowLayout());
        area2.setEditable(false);
        area2.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p2.add(area2);  
    }
    public void actionPerformed(ActionEvent e){
        
    }
    
    public static void main(String[] args){
        
        new Contact().setVisible(true);
    }
}
