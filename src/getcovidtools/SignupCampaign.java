/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class SignupCampaign extends JFrame implements ActionListener{
    JButton home,submit,acc,back,login;
    JTextField name,org,city,state,zip_code,email,phone,address,reg_id,country;
    SignupCampaign(){
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
        
        login=new JButton("LOGIN");
        login.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        login.setBackground(new Color(131,193,233));
        login.setBorder(BorderFactory.createEmptyBorder());
        login.setForeground(Color.WHITE);
        login.setBounds(1280,10,50,30);
        login.addActionListener(this);
        p1.add(login);
        
        
        
        JPanel p2=new JPanel();
        p2.setBounds(480,60,400,520);
        p2.setBackground(Color.WHITE);
        p2.setLayout(null);
        add(p2);
        
        
        JLabel lblhead = new JLabel("HealthCare Provider Info");
	lblhead.setForeground(new Color(0,0,255));
	lblhead.setFont(new Font("SAN_SERIF", Font.BOLD, 20));;
	lblhead.setBounds(100,20,300,40);
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
       
        
        
        JLabel reg = new JLabel("Registeration ID:");
	reg.setForeground(new Color(131,193,233));
	reg.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	reg.setBounds(23,130,120,25);
	p2.add(reg);
       
        
        
        reg_id=new JTextField();
        reg_id.setBounds(160,130,220,25);
        p2.add(reg_id);
        
     
        JLabel org_name = new JLabel("Org. Name:");
	org_name.setForeground(new Color(131,193,233));
	org_name.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	org_name.setBounds(23,160,120,25);
	p2.add(org_name);
      
        
        
        org=new JTextField();
        org.setBounds(160,160,220,25);
        p2.add(org);
        
        
       
        JLabel lblcity = new JLabel("City:");
	lblcity.setForeground(new Color(131,193,233));
	lblcity.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblcity.setBounds(23,280,120,25);
	p2.add(lblcity);
        
      
        city=new JTextField();
        city.setBounds(160,280,220,25);
        p2.add(city);
        
        
  
        JLabel lblst = new JLabel("State:");
	lblst.setForeground(new Color(131,193,233));
	lblst.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblst.setBounds(23,250,100,20);
	p2.add(lblst);
       
        state=new JTextField();
        state.setBounds(160,250,220,25);
        p2.add(state);
       
      
        JLabel lblphone = new JLabel("Contact:");
	lblphone.setForeground(new Color(131,193,233));
	lblphone.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblphone.setBounds(23,220,120,25);
	p2.add(lblphone);
      
        
       
        phone=new JTextField();
        phone.setBounds(160,220,220,25);
        p2.add(phone);
      
        
        
        JLabel lblemail = new JLabel("Email ID:");
	lblemail.setForeground(new Color(131,193,233));
	lblemail.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblemail.setBounds(23,190,120,25);
	p2.add(lblemail);
        
        email=new JTextField();
        email.setBounds(160,190,220,25);
        p2.add(email);
        
        JLabel lblcon = new JLabel("Country:");
	lblcon.setForeground(new Color(131,193,233));
	lblcon.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblcon.setBounds(23,310,120,25);
	p2.add(lblcon);
        
        country=new JTextField();
        country.setBounds(160,310,220,25);
        p2.add(country);
        
        JLabel lblzip = new JLabel("Zip Code:");
	lblzip.setForeground(new Color(131,193,233));
	lblzip.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lblzip.setBounds(23,340,120,25);
	p2.add(lblzip);
        
        zip_code=new JTextField();
        zip_code.setBounds(160,340,220,25);
        p2.add(zip_code);
        
        
        JLabel lbladr = new JLabel("Address:");
	lbladr.setForeground(new Color(131,193,233));
	lbladr.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	lbladr.setBounds(23,370,120,25);
	p2.add(lbladr);
        
        
        //textfield
        address=new JTextField();
        address.setBounds(160,370,220,25);
        p2.add(address);
        
      
        //save button
        submit = new JButton("Submit");
	submit.setForeground(Color.BLACK);
	submit.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
        submit.setBounds(65,460,100,30);
        submit.setBackground(new Color(131,193,233));
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
	p2.add(submit);
        
        //Back button
        back = new JButton("Back");
	back.setForeground(Color.BLACK);
	back.setFont(new Font("SAN_SERIF", Font.BOLD, 15));;
	back.setBounds(250,460,100,30);
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
            String sql = "insert into signup(full_name, id, org_name, city, state,  country, e_mail, address,  zip_code,contact, account_for) values(?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = c.con.prepareStatement(sql);
		st.setString(1, name.getText());
                st.setString(2, reg_id.getText());
		st.setString(3, org.getText());
		st.setString(4, city.getText());
		st.setString(5, state.getText());
                st.setString(6, country.getText());
                st.setString(7, email.getText());
                st.setString(8, address.getText());
                st.setString(9, zip_code.getText());
                st.setString(10, phone.getText());
                st.setString(11,"Campaigns");

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
        
        new SignupCampaign().setVisible(true);
    }
}
