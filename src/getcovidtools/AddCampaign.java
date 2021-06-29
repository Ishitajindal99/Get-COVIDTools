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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


/**
 *
 * @author HP
 */
public class AddCampaign extends JFrame implements ActionListener{
    JButton home,login,add_new;
    JTextField idtxt,needtxt,nametxt,emailtxt,phonetxt,statetxt,supptxt,citytxt,ziptxt,numtxt;
    JButton view,submit;
    Choice c1;
    JCheckBox cb1,cb2,cb3,cb4;
    //private String idcamp;
    String val;
    AddCampaign(){
        
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
        
        JLabel lblhead = new JLabel("Add New Campaign");
	lblhead.setForeground(Color.BLACK);
	lblhead.setFont(new Font("SAN_SERIF", Font.BOLD, 20));;
	lblhead.setBounds(170,2,250,50);
	p2.add(lblhead);
        
        
        //set name label
        JLabel lblId = new JLabel("User ID:");
	lblId.setForeground(Color.BLACK);
	lblId.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblId.setBounds(70, 65,120,25);
	p2.add(lblId);
        
        
        //name textfield
        idtxt=new JTextField();
        idtxt.setBounds(200,65,220,25);
        p2.add(idtxt);
        
        
        //set CustomerID label
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
        
        JLabel num = new JLabel("Unique Key(any):");
	num.setForeground(Color.BLACK);
	num.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	num.setBounds(70,360,120,25);
	p2.add(num);
        
        
        //Id Proof textfield
        numtxt=new JTextField();
        numtxt.setBounds(200,360,220,25);
        p2.add(numtxt);
        
        view=new JButton("View");
        view.setBorder(BorderFactory.createEmptyBorder());
        view.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        view.setForeground(new Color(0,0,255));
        view.setBackground(Color.WHITE);
        view.setBounds(170,415,80,30);
        view.addActionListener(this);
        p2.add(view);
        
        submit=new JButton("Submit");
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        submit.setBackground(new Color(0,0,255));
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,415,80,30);
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
                ResultSet rs=c.s.executeQuery("select full_name,e_mail,contact,state,city,zip_code from signup where id= '"+ idtxt.getText() +"'");
                while(rs.next()){
                    nametxt.setText(rs.getString(1)); 
                    emailtxt.setText(rs.getString(2));
                    phonetxt.setText(rs.getString(3)); 
                    statetxt.setText(rs.getString(4));
                    citytxt.setText(rs.getString(5));
                    ziptxt.setText(rs.getString(6));
                }
                
            }
        }catch(Exception ex){
            
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
                DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime now=LocalDateTime.now();
                //long millis=System.currentTimeMillis();
                //java.sql.Date dt=new java.sql.Date(millis);
                String sql = "insert into campaigns(full_name, id,email,contact,state, need,no_of_supplies,city,zip_code,start_date,c_no) values(?,?,?, ?, ?, ?, ?, ?,?,?,?)";
		PreparedStatement st = c.con.prepareStatement(sql);
		st.setString(1, nametxt.getText());
                st.setString(2, idtxt.getText());
		st.setString(3, emailtxt.getText());
		st.setString(4, phonetxt.getText());
                st.setString(6, chckvalue);
                st.setString(7, supptxt.getText());
                st.setString(5, statetxt.getText());
                st.setString(8, citytxt.getText());
                st.setString(9, ziptxt.getText());
                st.setString(10,dt.format(now));
                st.setString(11,numtxt.getText());
		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Campaign Details saved successfully ");
                }
                this.setVisible(false);
                new Homepage().setVisible(true);
            }
        }catch(Exception exc){
            System.out.println(exc);
        }
        
        
    }
    public static void main(String[] args){
        
        new AddCampaign().setVisible(true);
    }
}
