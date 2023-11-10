
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2-MWebb
 */
public class DAO {
    
    private static final String CONN_URL = "jdbc:mysql://computing.gfmat.org:3306/";
    private static final String DB_NAME = "2022c_MWebb_test";
    private static final String USERNAME = "2022c_MWebb";
    private static final String PASSWORD = "4karqaUCSmddPKv8";
    
    public static boolean sqlTestDBConnection() {
        boolean connection;
        try (Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD)) {
            System.out.println("CONNECTION MADE!");
            connection = true;
            con.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG..." + e.getMessage());
            connection = false;
        }
        
           return connection; 
    }
    
    public static ResultSet getData() throws SQLException {
        String sql = "SELECT * FROM tabs";
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME , USERNAME, PASSWORD);
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        return rs;
    }
    
    public static ResultSet getTab() throws SQLException {
        String sql ="SELECT TabBody " + "FROM Notes";
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        return rs;
        
                
        
    }
    
    
    
    
    
}
            
                 
            
            
        
        

