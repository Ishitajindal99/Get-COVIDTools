/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class About extends JFrame implements ActionListener{
    About(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
        JLabel NewLabel1 = new JLabel("About Us");
        NewLabel1.setForeground(Color.white);
        NewLabel1.setFont(new Font("SAN_SERIF", Font.BOLD, 50));
	NewLabel1.setBounds(520,50,1100,100); 
        p1.add(NewLabel1);
        
        
        
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        //p2.setForeground(new Color(131,193,233));
        p2.setBackground(Color.white);
        p2.setBounds(80,160,290,1200);
        add(p2);
        
        JLabel NewLabel2 = new JLabel("Our Mission");
        NewLabel2.setForeground(new Color(131,193,233));
        NewLabel2.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
	NewLabel2.setBounds(20,40,290,100); 
        p2.add(NewLabel2);
        
        JTextArea area2=new JTextArea("To help local hospitals & facilities\ngain"
                + "alternative solutions to essential \nCOVID supplies while recognizing\nmakers.");  
        area2.setBounds(20,160,270,500);
        area2.setLayout(new FlowLayout());
        area2.setEditable(false);
        area2.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p2.add(area2);  
         
        
        JPanel p3=new JPanel();
        p3.setLayout(null);
        p3.setBackground(new Color(131,193,233));
        
        p3.setBounds(390,160,290,1200);
        add(p3);
        
        JTextArea area3=new JTextArea("Many people may have excess\nsupplies or some makers may even\nbe in the capacity to create custom\nmasks, face shields, hand sanitizers,\nand other supplies that could be life-\nsaving tools when used by medical\nprofessionals for battling COVIDI9.\nThe public is not currently aware of\nthe potential impact and appreciation\nthat their supplies may provide to the\ngeneral community. Many individuals\nmay be able to help, but need a call to\n-action, honorable recognition,\npotential compensation, or perhaps\na unified means that allows them to\nchoose which health organization to\ndonate to.");  
        area3.setBounds(5,160,270,500);
        area3.setLayout(new FlowLayout());
        area3.setEditable(false);
        area3.setBackground(new Color(131,193,233));
        area3.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p3.add(area3);  
        
        JLabel NewLabel3 = new JLabel("The Need For Help");
        NewLabel3.setForeground(Color.white);
        NewLabel3.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
	NewLabel3.setBounds(5,40,290,100); 
        p3.add(NewLabel3);
        
        JPanel p4=new JPanel();
        p4.setLayout(null);
        //p2.setForeground(new Color(131,193,233));
        p4.setBackground(Color.white);
        p4.setBounds(700,160,290,1200);
        add(p4);
        
        JTextArea area4=new JTextArea("Prices for cleaning supplies & face\nmasks have increased drastically\n"
                + "due to COVID Because there is a\ndemand for these supplies people\nhave taken this as an opportunity to\n"
                + "get rich off of supplies they already\nhave. Our goal is to create a platform\nthat prevents price bidding\nor bribing for supplies instead\nmakers, suppliers and health\nprofessionals are united to\ncommunicate and come to request\nand volunteer as they please.");  
        area4.setBounds(20,160,270,500);
        area4.setLayout(new FlowLayout());
        area4.setEditable(false);
        area4.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p4.add(area4);  
        
        JLabel NewLabel4 = new JLabel("Bidding War");
        NewLabel4.setForeground(new Color(131,193,233));
        NewLabel4.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
	NewLabel4.setBounds(20,40,290,100); 
        p4.add(NewLabel4);
        
        JPanel p5=new JPanel();
        p5.setLayout(null);
        p5.setBackground(new Color(131,193,233));
        //p3.setBackground(Color.white);
        p5.setBounds(1010,160,290,1200);
        add(p5);
        
        JLabel NewLabel5 = new JLabel("Makers Contribution");
        NewLabel5.setForeground(Color.white);
        NewLabel5.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
	NewLabel5.setBounds(5,40,290,100); 
        p5.add(NewLabel5);
        
        JTextArea area5=new JTextArea("Big corporations, the Microsoft &\n"
                + "Tesla, are already making their\ncontribution to supply tools & money\n"
                + "to communities. In such a pandemic,\nevery contribution counts even if the\n"
                + "supplies are coming from makers and\nsmaller suppliers. Makers need to\nfeel that their contributions are just\nas meaningful as these offered by\n"
                + "larger organizations. With enough\nsupport, our community can make a\n"
                + "big difference and a positive global\nimpact.");  
        area5.setBounds(5,160,270,500);
        area5.setLayout(new FlowLayout());
        area5.setEditable(false);
        area5.setBackground(new Color(131,193,233));
        area5.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        p5.add(area5);  
        
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
    
    public static void main(String[] args){
        
        new About().setVisible(true);
    }
}
