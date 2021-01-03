
package lk.ijse.SPRDA.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sprda","root","ijse");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (dBConnection==null)?(dBConnection=new DBConnection()):(dBConnection);
    }
    public Connection getConnection(){
        return connection;
    }
}
