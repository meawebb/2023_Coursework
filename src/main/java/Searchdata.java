
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;



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
    
    public void sqlTestDBConnection() throws SQLException {
        try {
            Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD);
            String query = "SELECT Nameof FROM Tabs";
             ArrayList<String> list = new ArrayList<>();
                try (PreparedStatement preparedStatement = con.prepareStatement(query)){
                ResultSet resultSet = preparedStatement.executeQuery();
                ResultSetMetaData rsmd = resultSet.getMetaData();
                int columnCount = rsmd.getColumnCount();
                while(resultSet.next()){
                    int i = 1;
                    while(i<=columnCount){
                        list.add(resultSet.getString(i++));
                        
                        
                    }
                }
            }
               con.close();
        } catch(Exception e) {
                        System.out.println("SOMETHING WENT WRONG..." + e.getMessage());
        }
        
    }
}

            
            
        
    
                

      

    
    
     
    
    
   
    
   
    



    
    
 
    

   
    

