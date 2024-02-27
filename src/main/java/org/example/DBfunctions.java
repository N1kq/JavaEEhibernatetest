package org.example;
import java.sql.DriverManager;
import java.sql.Connection;
import java.lang.*;
public class DBfunctions {
    public Connection connect_to_db(String dbname, String user, String pass){
        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,pass);
            if(conn!=null){
                System.out.println("Connection established");
            } else {
                System.out.println("Connection failed");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
