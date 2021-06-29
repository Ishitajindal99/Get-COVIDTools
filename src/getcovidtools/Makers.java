/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author HP
 */
public class Makers extends JFrame implements ActionListener{
    JButton add_new2,home;
    JTable jt;
    JPanel p2;
    JMenu menu1, menu2;  
    JMenuItem i1, i2, i3;
    String val;
    Makers(){
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        setBounds(0,70,1365,1000);
        
        p2=new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT,14,14));
        p2.setBackground(Color.white);
        p2.setLocation(0,0);
        p2.setSize(1365,60);
        add(p2);
        
        JMenuBar mb=new JMenuBar(); 
        //mb.setPreferredSize(new Dimension(100,50));
        //mb.setBounds(1240,10,80,30);
        mb.setBackground(new Color(0,0,255));
        mb.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        mb.setForeground(Color.WHITE);
        menu1=new JMenu("Supplies");    
        menu1.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        menu1.setForeground(Color.white);
        //menu1.setSize()
        i1=new JMenuItem("Add");  
        i1.setForeground(Color.white);
        i1.setBackground(Color.black);
        i1.addActionListener(this);
        i2=new JMenuItem("Delete"); 
        
        i2.addActionListener(this);
        i3=new JMenuItem("Edit");  
        i3.setForeground(Color.white);
        i3.setBackground(Color.black);
        i3.addActionListener(this);
        menu1.add(i1); menu1.add(i2);menu1.add(i3);
        mb.add(menu1);
        
        
        p2.add(mb);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GetCovidTools/Icons/kuva-uutiseen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950,1050,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
        JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 51, 1365, 650); 
        add(NewLabel);
        
        JLabel lblhead = new JLabel("AMAZING CONTRIBUTERS");
	lblhead.setForeground(Color.BLACK);
	lblhead.setFont(new Font("SAN_SERIF", Font.BOLD, 35));;
	lblhead.setBounds(450,15,650,50);
	NewLabel.add(lblhead);
        
        
        JPanel p4=new JPanel();
        p4.setBounds(160,100,1000,450);
        p4.setBackground(Color.white);
        p4.setLayout(null);
        p4.setBorder(BorderFactory.createLineBorder(Color.black));
        NewLabel.add(p4);
        
        jt=new JTable();   
        jt.setBounds(1,104,2500,1050);
        jt.setForeground(Color.BLACK);
        jt.setRowHeight(35);
        JTableHeader header=jt.getTableHeader();
        header.setBackground(new Color(0,0,255));
        header.setForeground(Color.white);
        header.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        JScrollPane scrollPane = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        DefaultTableCellRenderer dtcr=new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(JLabel.CENTER);
        jt.setDefaultRenderer(Object.class, dtcr);
        jt.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        scrollPane.setBounds(0,0,1000,450);
        scrollPane.setVisible(true);
        p4.add(getContentPane().add(scrollPane));
        
        //p4.add(scrollPane);
        
        
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select full_name as name,email,contact,supply as supplies from makers"); 
            DefaultTableModel model = new DefaultTableModel();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols=rsmd.getColumnCount();
            String colm[]=new String[cols];
            for(int i=0;i<cols;i++)
            {
                colm[i]=rsmd.getColumnName(i+1);
                model.addColumn(colm[i]);
            }
            Object row[]=new Object[cols];
            while(rs.next()){
                for(int i=0;i<cols;i++)
                {
                    row[i]=rs.getString(i+1);
                }
                model.addRow(row);
            }
            jt.setModel(model);
            
            
        }catch(Exception e){
            System.out.println("SQL exception occured" + e);    
        }
        
        
        
    }

    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==home){
            new Homepage().setVisible(true);
        }
        if(e.getSource()==i1){
                int result=JOptionPane.showConfirmDialog(p2, "Sure, You are a supplier?", "Makers",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(result==JOptionPane.YES_OPTION){
                    new AddSupply().setVisible(true);
                }
                else{
                    i1.setEnabled(false);
                    
                  
                }
                
                //new AddCampaign().setVisible(true);
        }
        
        try{
        if(e.getSource()==i2){
            Conn c=new Conn();
            
            int result=JOptionPane.showConfirmDialog(p2, "Sure, You wanted to contribute?", "Makers",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(result==JOptionPane.YES_OPTION){
                    
                    String user_id;
                    user_id = JOptionPane.showInputDialog("Unique Supplier ID? ");
                    if(user_id!=null && user_id.length()>0){
                        String sql="delete from makers where m_no= '"+ user_id +"'";
                        c.s.executeUpdate(sql);
                    
                        JOptionPane.showMessageDialog(null, "Contibutions associated with " + user_id + "(if existed) is deleted successfully");
                    }else{
                        JOptionPane.showMessageDialog(null, "Input needed");
                    }
                }
                else{
                    i2.setEnabled(false);
                    
                }
            
        }}
        catch(Exception ex){
            
        }
        
        if(e.getSource()==i3)
        {
            //new Signup().setVisible(true);
            String[] options=new String[]{"Campaigns","Supplies"};
            int opt=JOptionPane.showOptionDialog(null, "You signed up for?", "Makers",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            if(opt==0){
               
                i3.setEnabled(false);
            }
            if(opt==1){
                new EditSupply().setVisible(true);
            }
        }
        
    }
    public static void main(String[] args){
        
        new Makers().setVisible(true);
    }
}
