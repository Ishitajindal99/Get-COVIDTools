
package getcovidtools;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class Homepage extends JFrame implements ActionListener{
    JButton home,campaign,FAQ,about,makers,supp_btn,need_btn,login;
    JLabel NewLabel1;
    JMenu menu1, menu2;  
    JMenuItem i1, i2, i3; 
    String val;
    JPanel p1;
    int data_m,data_c;
    Homepage(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);//extends tha frame to full size
        setLayout(null);
        
        
        //Adding first panel to add new customer
       p1=new JPanel();
        //p1.setLayout(new FlowLayout(FlowLayout.CENTER,12,8));
        p1.setLayout(null);
        p1.setBackground(new Color(131,193,233));
        p1.setLocation(0,0);
        p1.setSize(1365,50);
        add(p1);
        
        
        //main menu- panel1 buttons
        home=new JButton("Home");
        home.setBorder(BorderFactory.createEmptyBorder());
        home.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        home.setBackground(new Color(131,193,233));
        home.setForeground(Color.WHITE);
        home.setBounds(430,10,100,30);
        home.addActionListener(this);
        campaign=new JButton("Campaign");
        campaign.setBorder(BorderFactory.createEmptyBorder());
        campaign.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        campaign.setBackground(new Color(131,193,233));
        campaign.setForeground(Color.WHITE);
        campaign.setBounds(520,10,100,30);
        campaign.addActionListener(this);
        makers=new JButton("Makers");
        makers.setBackground(new Color(131,193,233));
        makers.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        makers.setBorder(BorderFactory.createEmptyBorder());
        makers.setForeground(Color.WHITE);
        makers.setBounds(610,10,100,30);
        makers.addActionListener(this);
        FAQ=new JButton("Contact");
        FAQ.setBorder(BorderFactory.createEmptyBorder());
        FAQ.setBackground(new Color(131,193,233));
        FAQ.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        FAQ.setForeground(Color.WHITE);
        FAQ.setBounds(700,10,80,30);
        FAQ.addActionListener(this);
        about=new JButton("About");
        about.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        about.setBackground(new Color(131,193,233));
        about.setBorder(BorderFactory.createEmptyBorder());
        about.setForeground(Color.WHITE);
        about.setBounds(770,10,80,30);
        about.addActionListener(this);
        login=new JButton("LOGOUT");
        login.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        login.setBackground(new Color(131,193,233));
        login.setBorder(BorderFactory.createEmptyBorder());
        login.setForeground(Color.WHITE);
        login.setBounds(1250,10,100,30);
        login.addActionListener(this);
        
        
        p1.add(home);p1.add(campaign);p1.add(makers);p1.add(FAQ);p1.add(about);p1.add(login);
        
        //BACKGROUND IMAGE
        
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
            
            //data_m="select count(m_no) from makers";
        }catch(Exception ex){
            
        }
        try{
            Conn c=new Conn();
            ResultSet r2=c.s.executeQuery("select count(c_no) as rowct2 from campaigns");
            r2.next();
            data_c=r2.getInt("rowct2");
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
        
    }
    
    public void actionPerformed(ActionEvent e){
       
        if(e.getSource()==login){
            //new Viewall().setVisible(true);
            int result=JOptionPane.showConfirmDialog(null, "Sure, You want to exit?", "Homepage",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(result==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
                
        }
        
        if(e.getSource()==home){
            new Homepage().setVisible(true);
        }
        
        if(e.getSource()==campaign){
            new Campaign().setVisible(true);
        }
        if(e.getSource()==makers){
            new Makers().setVisible(true);
        }
        if(e.getSource()==about){
            new About().setVisible(true);
        }
        if(e.getSource()==FAQ){
            new Contact().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        
        new Homepage().setVisible(true);
    }
}
