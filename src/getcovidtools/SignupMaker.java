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
import javax.swing.*;


/**
 *
 * @author HP
 */
public class SignupMaker extends JFrame implements ActionListener{
    JButton home,submit,acc,back,login;
    JTextField name,org,city,state,zip_code,email_id,contact_txt,address,user_id,country,adr;
    Choice c1;
    SignupMaker(){
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
        
        
        
        JPanel p2=new JPanel();
        p2.setBounds(480,60,400,450);
        p2.setBackground(Color.WHITE);
        p2.setLayout(null);
        add(p2);
        
       
        JLabel lblhead = new JLabel("Makers Info");
	lblhead.setForeground(new Color(0,0,255));
	lblhead.setFont(new Font("SAN_SERIF", Font.BOLD, 20));;
	lblhead.setBounds(150,20,300,40);
	p2.add(lblhead);
        
        
        //set name label
        JLabel lblname = new JLabel("Full Name:");
	lblname.setForeground(new Color(131,193,233));
	lblname.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblname.setBounds(23,100,120,25);
	p2.add(lblname);
        
        //enter name textfield
        name=new JTextField();
        name.setBounds(160,100,220,25);
        p2.add(name);
       
        
        
        JLabel reg = new JLabel("User ID:");
	reg.setForeground(new Color(131,193,233));
	reg.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	reg.setBounds(23,130,120,25);
	p2.add(reg);
       
        
       
        user_id=new JTextField();
        user_id.setBounds(160,130,220,25);
        p2.add(user_id);
        
        
        
        
       
        JLabel lblcity = new JLabel("City:");
	lblcity.setForeground(new Color(131,193,233));
	lblcity.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblcity.setBounds(23,250,120,25);
	p2.add(lblcity);
        
        
        
        city=new JTextField();
        city.setBounds(160,250,220,25);
        p2.add(city);
        
        
     
        JLabel lblst = new JLabel("State:");
	lblst.setForeground(new Color(131,193,233));
	lblst.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblst.setBounds(23,220,100,20);
	p2.add(lblst);
       
        state=new JTextField();
        state.setBounds(160,220,220,25);
        p2.add(state);
       
       
        JLabel lblphone = new JLabel("Contact:");
	lblphone.setForeground(new Color(131,193,233));
	lblphone.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblphone.setBounds(23,190,120,25);
	p2.add(lblphone);
      
   
        contact_txt=new JTextField();
        contact_txt.setBounds(160,190,220,25);
        p2.add(contact_txt);
      
        
      
        JLabel lblemail = new JLabel("Email ID:");
	lblemail.setForeground(new Color(131,193,233));
	lblemail.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblemail.setBounds(23,160,120,25);
	p2.add(lblemail);
        
        email_id=new JTextField();
        email_id.setBounds(160,160,220,25);
        p2.add(email_id);
        
        
        
        
      
        //save button
        submit = new JButton("Submit");
	submit.setForeground(Color.BLACK);
	submit.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
        submit.setBounds(65,340,100,30);
        submit.setBackground(new Color(131,193,233));
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
	p2.add(submit);
        
        //Back button
        back = new JButton("Back");
	back.setForeground(Color.BLACK);
	back.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	back.setBounds(250,340,100,30);
        back.setForeground(new Color(131,193,233));
        back.setBackground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
	p2.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GetCovidTools/Icons/kuva-uutiseen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950,1050,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 51, 1365, 650); 
        add(NewLabel);

}
    public void actionPerformed(ActionEvent e){
        try{
            Conn c=new Conn();
            
            if(e.getSource()==back){
                this.setVisible(false);
                //new Signup_choice().setVisible(true);
                
            }
            if(e.getSource()==login){
                this.setVisible(false);
                new Login().setVisible(true);
            }
            if(e.getSource()== submit){
            String sql = "insert into signup(full_name, id,contact,e_mail,account_for,city,state) values(?, ?, ?, ?, ?,?,?)";
		PreparedStatement st = c.con.prepareStatement(sql);
		st.setString(1, name.getText());
                st.setString(2, user_id.getText());
		
                st.setString(4, email_id.getText());
                
                st.setString(3, contact_txt.getText());
                //st.setString(5, (String)c1.getSelectedItem());
                st.setString(5,"Makers");
                st.setString(6,city.getText());
                st.setString(7,state.getText());
		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Registered Successfully ");
                }
            }
       }catch(Exception exc){
                System.out.println(exc);
       }
    }
    public static void main(String[] args){
        
        new SignupMaker().setVisible(true);
    }
}
