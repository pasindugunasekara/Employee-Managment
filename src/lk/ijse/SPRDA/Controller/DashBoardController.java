
package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DashBoardController {

    public int getcurrentlyEmployee() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sprda","root","ijse");
        
        String sql="SELECT COUNT(*) FROM employee";
        
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        
        if(rst.next()){
            return rst.getInt(1);
        }
        return 0;
    }
    
}
