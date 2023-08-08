import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vishnuneem
 */


public class MyConnection {
    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/fun", "root", "vishnu@123");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException " + e);
        }
            catch(NullPointerException e)
                    {
                    System.out.println(e);
                    }
        catch (SQLException e) {
            System.out.println("SQLException " + e);
        }
        return c;
    }
}

/*public class MyConnection{
    
public static void main(String args[]){  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:java","root","1234");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from emp");  
        while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
    }catch
            (Exception e){ System.out.println(e);}  
    }  
}*/