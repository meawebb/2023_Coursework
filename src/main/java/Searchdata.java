
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
public class Searchdata {
    private static final String CONN_URL = "jdbc:mysql://computing.gfmat.org:3306/";
    private static final String DB_NAME = "2022c_MWebb_test";
    private static final String USERNAME = "2022c_MWebb";
    private static final String PASSWORD = "4karqaUCSmddPKv8";
    
     public static ResultSet getData() throws SQLException {
     String selectSQL = "SELECT TABID, SONGNAME FROM DBUSER WHERE TABID = ?" ;
   
     Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD);
     String sql = "SELECT * FROM tabs";
     
    Statement st = con.prepareStatement(selectSQL);
     .setInt(1, 1001);
    ResultSet rs = st.executeQuery(sql);
    
     
    
    
   
    
   
    

}

    
    
 
    

   
    

