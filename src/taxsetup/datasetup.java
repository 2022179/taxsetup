/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxsetup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Primm
 */
public class datasetup {
    final String DB_BASE_URL = "jdbc:mysql://localhost";
    final String USER = "CCT";
    final String PASSWORD ="dublin"; 
    
    //method to set up our database
    public boolean setupDB() throws SQLException{
       Connection conn= DriverManager.getConnection( DB_BASE_URL,USER,PASSWORD);
    
}
}