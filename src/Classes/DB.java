/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.mysql.cj.jdbc.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abdel
 */
public class DB {
    private static String serverName = "localhost";    
    private static String userName = "root";
    private static String dbName = "gestionbiblio";
    private static Integer portNumber = 3306;
    private static String password = "admin";
    
    public static Connection getConnection(){
        
        Connection connection = null; 
        
        try {
        MysqlDataSource dataSource = new MysqlDataSource();
        
        dataSource.setServerName(serverName);
        dataSource.setUser(userName);
        dataSource.setDatabaseName(dbName);
        dataSource.setPort(portNumber);
        dataSource.setPassword( password);
        
        
            connection = dataSource.getConnection();
        } catch (SQLException ex) {
            System.out.println("******************************");
            System.out.println("* Awdi rak maconnectich !!!! *");
            System.out.println("******************************");
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    
}
