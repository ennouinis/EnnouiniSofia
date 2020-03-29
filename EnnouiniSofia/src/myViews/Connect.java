package myViews;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Connect {
    
Connection cnx = null;
ResultSet Rs = null;
PreparedStatement Ps = null;

public static Connection ConnectDB() { 
    try { 
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
        Connection cnx = DriverManager.getConnection("jdbc:odbc:MyDataBase", "", ""); 
        return cnx; 
    }
    catch (Exception e) { 
        JOptionPane.showMessageDialog (null,e); 
        return null;
    }
}

}
