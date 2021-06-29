/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Signup_choice extends JFrame implements ActionListener{
    JButton supp_btn,need_btn,login;
    JLabel NewLabel1;
    int data_m,data_c;
    Signup_choice()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//extends tha frame to full size
        setLayout(null);
        
        
        //Adding first panel to add new customer
        JPanel p1=new JPanel();
        //p1.setLayout(new FlowLayout(FlowLayout.CENTER,12,8));
        p1.setLayout(null);
        p1.setBackground(new Color(131,193,233));
        p1.setLocation(0,0);
        p1.setSize(1365,50);
        add(p1);
        
        login=new JButton("LOGIN");
        login.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        login.setBackground(new Color(131,193,233));
        login.setBorder(BorderFactory.createEmptyBorder());
        login.setForeground(Color.WHITE);
        login.setBounds(1280,10,50,30);
        login.addActionListener(this);
        p1.add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GetCovidTools/Icons/kuva-uutiseen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950,1050,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 51, 1365, 650); 
        add(NewLabel);
        
        //Heading label
        NewLabel1 = new JLabel("Send protective supplies where it counts");
        NewLabel1.setForeground(Color.darkGray);
        NewLabel1.setFont(new Font("SAN_SERIF", Font.BOLD, 50));
	NewLabel1.setBounds(200,70,1100,100); 
        NewLabel.add(NewLabel1);
        
        //Lables for counts
        
        try{
            Conn c=new Conn();
            ResultSet r=c.s.executeQuery("select count(m_no) as rowct from makers");
            r.next();
            data_m=r.getInt("rowct");
            ResultSet r2=c.s.executeQuery("select count(c_no) as rowct2 from campaigns");
            r2.next();
            data_c=r2.getInt("rowct2");
            //data_m="select count(m_no) from makers";
        }catch(Exception ex){
            
        }
        
        JLabel ct_label1=new JLabel();
        ct_label1.setForeground(Color.darkGray);
        ct_label1.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        ct_label1.setBounds(515,370,300,40);
        ct_label1.setText(Integer.toString(data_m));
        NewLabel.add(ct_label1);
        
        JLabel ctmakers=new JLabel("Makers");
        ctmakers.setForeground(Color.GREEN);
        ctmakers.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        ctmakers.setBounds(500,400,300,40);
        NewLabel.add(ctmakers);
        
        
        JLabel ct_label2=new JLabel();
        ct_label2.setForeground(Color.darkGray);
        ct_label2.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        ct_label2.setBounds(765,370,300,40);
        ct_label2.setText(Integer.toString(data_c));
        NewLabel.add(ct_label2);
        
        JLabel ctcamp=new JLabel("Campaigns");
        ctcamp.setForeground(Color.GREEN);
        ctcamp.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        ctcamp.setBounds(750,400,300,40);
        NewLabel.add(ctcamp);
        
        //Buttons for sign up
        supp_btn=new JButton("I HAVE SUPPLIES");
        supp_btn.setBorder(BorderFactory.createEmptyBorder());
        supp_btn.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        supp_btn.setBackground(new Color(0,0,255));
        supp_btn.setForeground(Color.white);
        supp_btn.setBounds(450,500,150,30);
        supp_btn.addActionListener(this);
        NewLabel.add(supp_btn);
        
        need_btn=new JButton("I NEED SUPPLIES");
        need_btn.setBorder(BorderFactory.createEmptyBorder());
        need_btn.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        need_btn.setBackground(new Color(0,0,255));
        need_btn.setForeground(Color.white);
        need_btn.setBounds(730,500,150,30);
        need_btn.addActionListener(this);
        NewLabel.add(need_btn);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==need_btn){
            new SignupCampaign().setVisible(true);
            //NewLabel1.setVisible(false);
        }
        if(e.getSource()==supp_btn){
            new SignupMaker().setVisible(true);
            
        }
        if(e.getSource()==login){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        
        new Signup_choice().setVisible(true);
    }
    
}