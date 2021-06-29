/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Login extends JFrame implements ActionListener{
   
    JButton submit,home,back,sign_up;
    JTextField name,id_txt;
    JRadioButton r1,r2,r3,r4,r5;
    Choice c1;
    String ID;
    Login(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//extends tha frame to full size
        setLayout(null);
        
        
        
        JPanel p1=new JPanel();
        //p1.setLayout(new FlowLayout(FlowLayout.CENTER,12,8));
        p1.setLayout(null);
        p1.setBackground(new Color(131,193,233));
        p1.setLocation(0,0);
        p1.setSize(1365,50);
        add(p1);
        
        sign_up=new JButton("SIGN UP");
        sign_up.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        sign_up.setBackground(new Color(131,193,233));
        sign_up.setBorder(BorderFactory.createEmptyBorder());
        sign_up.setForeground(Color.WHITE);
        sign_up.setBounds(1280,10,80,30);
        sign_up.addActionListener(this);
        p1.add(sign_up);
        
        //Adding panel
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        p2.setLocation(350,180);
        p2.setSize(650,410);
        add(p2);
        
       
        
        
        JLabel first_name = new JLabel("Full Name");
	first_name.setForeground(new Color(131,193,233));
	first_name.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
        first_name.setBounds(120,80,120,20);
	p2.add(first_name);
       
        
        name=new JTextField();
        name.setBounds(120,110,400,30);
        p2.add(name);
        
        JLabel id = new JLabel("User ID");
	id.setForeground(new Color(131,193,233));
	id.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
        id.setBounds(120,160,120,20);
	p2.add(id);
       
        
        id_txt=new JTextField();
        id_txt.setBounds(120,190,400,30);
        p2.add(id_txt);
        
        JLabel choice = new JLabel("Account For: ");
	choice.setForeground(new Color(131,193,233));
	choice.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
        choice.setBounds(130,245,120,20);
	p2.add(choice);
        
        
        r1=new JRadioButton("Campaigns");    
        r2=new JRadioButton("Makers");   
        
        r1.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        r2.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        
        r1.setBounds(250,240,150,30);
        r1.setForeground(new Color(131,193,233));
        r1.setBackground(Color.white);
        r1.addActionListener(this);
        r2.setBackground(Color.white);
        r2.setBounds(410,240,120,30); 
        r2.setForeground(new Color(131,193,233));
        r2.addActionListener(this);
        
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);    
        p2.add(r1);p2.add(r2);  
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GetCovidTools/Icons/kuva-uutiseen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950,1050,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 51, 1365, 650); 
        add(NewLabel);
        
        /*
        back=new JButton("Back");
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        back.setForeground(new Color(0,0,255));
        back.setBackground(Color.WHITE);
        back.setBounds(220,300,80,30);
        back.addActionListener(this);
        p2.add(back);
        */
        submit=new JButton("Login");
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        submit.setBackground(new Color(0,0,255));
        submit.setForeground(Color.WHITE);
        submit.setBounds(270,300,80,30);
        submit.addActionListener(this);
        p2.add(submit);
       
    }
        public void actionPerformed(ActionEvent e){
        
            ID=id_txt.getText();
            try{
            Conn c=new Conn();
            
            if(e.getSource()==sign_up){
                new Signup_choice().setVisible(true);
            }
            
            if(e.getSource()==submit){
                String nameTxt;
                String idTxt;
                String supply="";
                nameTxt = name.getText();
                idTxt = id_txt.getText();
                if(r1.isSelected()){
                    
                    supply=r1.getText();
                   
                    
                }
                
                if(r2.isSelected()){
                    
                    supply=r2.getText();
                    
                }
                
                String sql="select full_name, id, account_for from signup where full_name='"+nameTxt+"' and id='"+idTxt+"' and account_for='"+supply+"'";
                //c.s=c.con.createStatement();
                c.s.executeQuery(sql);
                ResultSet rs=c.s.executeQuery(sql);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                    new Homepage().setVisible(true);
                    //new Homepage().login.setVisible(false);
                    this.setVisible(false);
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Try again");
                }
                    
            
            }
            
       }catch(Exception exc){
                System.out.println(exc);
       }
        
        
        
        
    }
        public static void main(String[] args){
        
            new Login().setVisible(true);
        }
}