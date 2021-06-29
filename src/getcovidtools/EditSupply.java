/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class EditSupply  extends JFrame implements ActionListener{
    JButton home,campaign,FAQ,about,makers,supp_btn,need_btn,login,add_new;
    JTextField needtxt,nametxt,emailtxt,phonetxt,statetxt,supptxt,citytxt,ziptxt,numtxt;
    JButton view,submit;
    String val;
    JCheckBox cb1,cb2,cb3,cb4;
    EditSupply(){
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
        JLabel NewLabel1 = new JLabel("Makers");
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
        
        
        JLabel lblId = new JLabel("Unique ID(used)");
	lblId.setForeground(Color.BLACK);
	lblId.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblId.setBounds(70, 65,150,25);
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
        JLabel lblstate = new JLabel("City:");
	lblstate.setForeground(Color.BLACK);
	lblstate.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblstate.setBounds(70,185,100,20);
	p2.add(lblstate);
        
        
        //State textfield
        statetxt=new JTextField();
        statetxt.setBounds(200,185,220,25);
        p2.add(statetxt);
        
        
        JLabel lblneed = new JLabel("Supply:");
	lblneed.setForeground(Color.BLACK);
	lblneed.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblneed.setBounds(70,215,100,20);
	p2.add(lblneed);
        
        
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
        
        
        view=new JButton("View");
        view.setBorder(BorderFactory.createEmptyBorder());
        view.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        view.setForeground(new Color(0,0,255));
        view.setBackground(Color.WHITE);
        view.setBounds(170,355,80,30);
        view.addActionListener(this);
        p2.add(view);
        
        submit=new JButton("Save");
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        submit.setBackground(new Color(0,0,255));
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,355,80,30);
        submit.addActionListener(this);
        p2.add(submit);
        
        
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==home){
                new Homepage().setVisible(true);
        }
        
        try{
            if(e.getSource()==view){
            
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select full_name,email,contact,address,id from makers where m_no= '"+ numtxt.getText() +"'");
                while(rs.next()){
                    nametxt.setText(rs.getString(1)); 
                    emailtxt.setText(rs.getString(2));
                    phonetxt.setText(rs.getString(3)); 
                    statetxt.setText(rs.getString(4)); 
                    val=rs.getString(5);
                }
            }
            
        }catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Something went wrong ");
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
	    			String city =  statetxt.getText();
                                String supp =  supptxt.getText();
	    			String num=numtxt.getText();
                                
                                
                                String sql = "update makers set full_name = '"+name+"', supply='"+ chckvalue +"', email= '"+email+"', contact = '"+phone+"', address = '"+city+"',  no_of_supplies= '"+supp+"' where M_NO = '"+num+"'";
                                c.s.executeUpdate(sql);
                                
                                String sql2 = "update signup set full_name = '"+name+"', e_mail= '"+email+"', contact = '"+phone+"', city = '"+city+"' where id = '"+val+"'";
                                c.s.executeUpdate(sql2);
                                JOptionPane.showMessageDialog(null, "Details Updated Successfully");
                                new Homepage().setVisible(true);
                                this.setVisible(false);
                }   
        }catch(Exception exc){
            System.out.println(exc);
        }
        
        
    }       

    public static void main(String[] args){
        
        new EditSupply().setVisible(true);
    }
    
    
}
