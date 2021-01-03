 package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Job;

public class JobController {

    public boolean saveJob(Job j1) throws ClassNotFoundException, SQLException {
        Connection con=DBConnection .getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO job VALUES(?,?,?,?)");
        stm.setString(1, j1.getEp_id());
        stm.setString(2, j1.getDesignation());
        stm.setString(3, j1.getDistrict_Office());
        stm.setString(4, j1.getDivisional_Office());
        
        return stm.executeUpdate()>0;
    }

    public boolean dropJob(String requestEp_id) throws ClassNotFoundException, SQLException {
        
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE  FROM Job WHERE Ep_id='"+requestEp_id+"'").executeUpdate()>0;
    }

    public Boolean updateState(Job j1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE job SET Designation=?,District_Office=?,Divisional_Office=? WHERE Ep_id=?");
         
            stm.setObject(1, j1.getDesignation());
            stm.setObject(2, j1.getDistrict_Office());
            stm.setObject(3, j1.getDivisional_Office());
            stm.setObject(4, j1.getEp_id());
            
            return stm.executeUpdate()>0;
    }
    
}
