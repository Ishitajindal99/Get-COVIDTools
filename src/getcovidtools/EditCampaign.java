/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class EditCampaign extends JFrame implements ActionListener{
    JButton home,campaign,FAQ,about,makers,supp_btn,need_btn,login,add_new;
    JTextField needtxt,nametxt,emailtxt,phonetxt,statetxt,supptxt,citytxt,ziptxt,numtxt;
    JButton view,submit;
    String val;
    JCheckBox cb1,cb2,cb3,cb4;
    EditCampaign(){
        
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
        JLabel NewLabel1 = new JLabel("Campaigns");
        NewLabel1.setForeground(Color.white);
        NewLabel1.setFont(new Font("SAN_SERIF", Font.BOLD, 50));
	NewLabel1.setBounds(520,50,1100,100); 
        p1.add(NewLabel1);
        
        
        JPanel p2=new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(370,200,550,610);
        p2.setLayout(null);
        add(p2);
        
        JLabel lblhead = new JLabel("Edit Details");
	lblhead.setForeground(Color.BLACK);
	lblhead.setFont(new Font("SAN_SERIF", Font.BOLD, 20));;
	lblhead.setBounds(210,2,250,50);
	p2.add(lblhead);
        
        
        //set name label
        JLabel lblId = new JLabel("Unique ID(used)");
	lblId.setForeground(Color.BLACK);
	lblId.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblId.setBounds(70, 65,120,25);
	p2.add(lblId);
        
        
        //name textfield
        numtxt=new JTextField();
        numtxt.setBounds(200,65,220,25);
        p2.add(numtxt);
        
        
        JLabel lblname = new JLabel("Full Name:");
	lblname.setForeground(Color.BLACK);
	lblname.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblname.setBounds(70,95,120,25);
	p2.add(lblname);
        
        
        //CustomerId textfield
        nametxt=new JTextField();
        nametxt.setBounds(200,95,220,25);
        p2.add(nametxt);
        
        
        
        //set email label
        JLabel lblemail = new JLabel("Email:");
	lblemail.setForeground(Color.BLACK);
	lblemail.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblemail.setBounds(70,125,120,25);
	p2.add(lblemail);
        
        
        //email textfield
        emailtxt=new JTextField();
        emailtxt.setBounds(200,125,220,25);
        p2.add(emailtxt);
        
        
        
        //set Phone label
        JLabel lblphone = new JLabel("Contact:");
	lblphone.setForeground(Color.BLACK);
	lblphone.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblphone.setBounds(70,155,120,25);
	p2.add(lblphone);
        
        
        //Phone textfield
        phonetxt=new JTextField();
        phonetxt.setBounds(200,155,220,25);
        p2.add(phonetxt);
        
        
        //set State label
        JLabel lblstate = new JLabel("State:");
	lblstate.setForeground(Color.BLACK);
	lblstate.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblstate.setBounds(70,185,100,20);
	p2.add(lblstate);
        
        
        //State textfield
        statetxt=new JTextField();
        statetxt.setBounds(200,185,220,25);
        p2.add(statetxt);
        
        
        JLabel lblneed = new JLabel("Need:");
	lblneed.setForeground(Color.BLACK);
	lblneed.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblneed.setBounds(70,215,100,20);
	p2.add(lblneed);
        /*
        c1 = new Choice();
	c1.add("Face Masks");
        c1.add("Gloves");
        c1.add("PPE Kits");
        c1.add("Oxygen Cylinders");
	c1.setBounds(200,215,220,25);
        c1.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	p2.add(c1);
        */
        
        cb1=new JCheckBox("Face Masks");
        cb1.setBounds(200,215,100,25);
        cb1.setBackground(Color.white);
        cb2=new JCheckBox("Gloves");
        cb2.setBounds(350,215,100,25);
        cb2.setBackground(Color.white);
        cb3=new JCheckBox("PPE Kits");
        cb3.setBounds(200,245,100,25);
        cb3.setBackground(Color.white);
        cb4=new JCheckBox("Hand Sanitizers");
        cb4.setBounds(350,245,150,25);
        cb4.setBackground(Color.white);
        p2.add(cb1);p2.add(cb2);
        p2.add(cb3);p2.add(cb4);
        
        JLabel lblnum = new JLabel("No. of Supplies:");
	lblnum.setForeground(Color.BLACK);
	lblnum.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblnum.setBounds(70,270,120,25);
	p2.add(lblnum);
        
        
        //Id Proof textfield
        supptxt=new JTextField();
        supptxt.setBounds(200,270,220,25);
        p2.add(supptxt);
        
        JLabel city = new JLabel("City:");
	city.setForeground(Color.BLACK);
	city.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	city.setBounds(70,300,120,25);
	p2.add(city);
        
        
        //Id Proof textfield
        citytxt=new JTextField();
        citytxt.setBounds(200,300,220,25);
        p2.add(citytxt);
        
        JLabel zip = new JLabel("Zip Code:");
	zip.setForeground(Color.BLACK);
	zip.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	zip.setBounds(70,330,150,25);
	p2.add(zip);
        
        
        //Id Proof textfield
        ziptxt=new JTextField();
        ziptxt.setBounds(200,330,220,25);
        p2.add(ziptxt);
        
        view=new JButton("View");
        view.setBorder(BorderFactory.createEmptyBorder());
        view.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        view.setForeground(new Color(0,0,255));
        view.setBackground(Color.WHITE);
        view.setBounds(170,375,80,30);
        view.addActionListener(this);
        p2.add(view);
        
        submit=new JButton("Save");
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        submit.setBackground(new Color(0,0,255));
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,375,80,30);
        submit.addActionListener(this);
        p2.add(submit);
        
      
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==home){
                new Homepage().setVisible(true);
        }
        
        try{
             Conn c = new Conn();
             if(e.getSource()==view){      
                    ResultSet rs = c.s.executeQuery("select * from campaigns where c_no = '"+ numtxt.getText() +"'");
                    if(rs.next()){
                        nametxt.setText(rs.getString(1));  
                        emailtxt.setText(rs.getString(2));
                        //t3.setText(rs.getString(3));  
                        phonetxt.setText(rs.getString(3));
                        statetxt.setText(rs.getString(4));  
                        //needtxt.setText(rs.getString(6));
                        supptxt.setText(rs.getString(6));
                        citytxt.setText(rs.getString(7));
                        ziptxt.setText(rs.getString(8));
                        val=rs.getString(11);
                    }
             }
        }
        catch(Exception ex){
            
        }
        
        
        try{
            
                Conn c=new Conn();
                String chckvalue="";
                if(cb1.isSelected()){
                        chckvalue+=cb1.getText()+",";
                        
                }
                if(cb2.isSelected()){
                    chckvalue+=cb2.getText()+",";
                }
                if(cb3.isSelected()){
                    chckvalue+=cb3.getText()+",";
                }
                if(cb4.isSelected()){
                    chckvalue+=cb4.getText()+",";
                }        
                if(e.getSource()==submit){
                                
                                String name = nametxt.getText();
                                String email = emailtxt.getText(); 
	    			String phone =  phonetxt.getText();
	    			String state =  statetxt.getText();
                                String supp =  supptxt.getText();
	    			String city =  citytxt.getText();
	    			String zip =  ziptxt.getText(); 
                                String num=numtxt.getText();
                                
                                String sql = "update campaigns set full_name = '"+name+"', need='"+ chckvalue +"', email= '"+email+"', contact = '"+phone+"', state = '"+state+"',  no_of_supplies= '"+supp+"',city = '"+city+"', zip_code = '"+zip+"' where c_no = '"+num+"'";
                                c.s.executeUpdate(sql);
                                
                                String sql2 = "update signup set full_name = '"+name+"', e_mail= '"+email+"', contact = '"+phone+"', state = '"+state+"',  city = '"+city+"', zip_code = '"+zip+"' where id = '"+val+"'";
                                c.s.executeUpdate(sql2);
                                JOptionPane.showMessageDialog(null, "Details Updated Successfully");
                                setVisible(false);
                }   
        }catch(Exception exc){
            System.out.println(exc);
        }
        
        
        
    }       

    public static void main(String[] args){
        
        new EditCampaign().setVisible(true);
    }
    
}
