/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcovidtools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Conn {
    Connection con;
    Statement s;
    public Conn() throws SQLException{
        try 
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/covid","app","123");
            s = con.createStatement(); 
        } catch(ClassNotFoundException ex) {
         System.out.println("Driver Class not found "+ ex);
        } 
    }
}
