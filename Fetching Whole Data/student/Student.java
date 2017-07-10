/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Abhishek
 */
import java.sql.*;
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","abhi");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from stu");
            while(rs.next()){
                
                System.out.println(rs.getString(1) + " "+rs.getInt(2)+ " "+rs.getFloat(3));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
