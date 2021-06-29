/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class Splash {
    public static void main(String[] args){
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=600; i+=10, x+=7){
            f1.setLocation(700 - ((i+x)/2), 400 - (i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
}
}
    class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        //setLayout(new FlowLayout());
        ImageIcon first_screen = new ImageIcon(ClassLoader.getSystemResource("getcovidtools/Icons/83229304.jpg"));
        Image splash_i1 = first_screen.getImage().getScaledInstance(1020, 700,Image.SCALE_DEFAULT);//to set image length and width
        ImageIcon splash_i2 = new ImageIcon(splash_i1);
        //ImageIcon added using JLabel
        JLabel splash_imglabel = new JLabel(splash_i2);
        add(splash_imglabel);
        
        JLabel header=new JLabel("GET COVIDTools...");
        header.setBounds(100,100,500,50);
        header.setForeground(new Color(0,0,255));
        header.setFont(new Font("SAN_SERIF", Font.BOLD, 30));
        splash_imglabel.add(header);
        
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            Login login = new Login();
            login.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
