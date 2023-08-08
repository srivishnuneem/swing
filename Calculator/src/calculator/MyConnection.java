/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.sql.*;

/**
 *
 * @author vishnuneem
 */
public class MyConnection {
    public static Connection getconnection(){
        Connection c = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/calculator","root","vishnu@123");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return c;
    }
}
