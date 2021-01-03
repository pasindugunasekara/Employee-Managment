
package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Employee;


public class EmployeeController {

    public boolean saveEmployee(Employee e1) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm= con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?)");
        stm.setString(1, e1.getEp_id());
        stm.setString(2, e1.getName());
        stm.setString(3, e1.getAddress());
        stm.setString(4, e1.getContact());
        stm.setString(5, e1.getBirthday());
        stm.setString(6, e1.getState());
        stm.setString(7, e1.getCity());
        stm.setString(8, e1.getEmail());
        stm.setString(9, e1.getJoin_date());
        
        return stm.executeUpdate()>0;
    }

    public Employee getEmployee(String requestEp_id) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set= connection.prepareStatement("SELECT * FROM employee WHERE Ep_id=+'"+requestEp_id+"'").executeQuery();
    
        if(set.next()){
            return new Employee(
                        set.getString("Ep_id"),
                        set.getString("Name"),
                        set.getString("Address"),
                        set.getString("Contact"),
                        set.getString("Birthday"),
                        set.getString("State"),
                        set.getString("City"),
                        set.getString("Email"),
                        set.getString("Join_date")
                        
                );
        }
        return null;
    
    }

    public boolean dropEmployee(String requestEP_ID) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE FROM employee WHERE Ep_id='"+requestEP_ID+"'").executeUpdate()>0;
    }

    public boolean updateState(Employee e1) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement("UPDATE employee SET Name=?,Address=?,Contact=?,Birthday=?,State=?,City=?,Email=?,Join_date=? WHERE Ep_id=?");
        
        stm.setObject(1, e1.getName());
        stm.setObject(2, e1.getAddress());
        stm.setObject(3, e1.getContact());
        stm.setObject(4, e1.getBirthday());
        stm.setObject(5, e1.getState());
        stm.setObject(6, e1.getCity());
        stm.setObject(7, e1.getEmail());
        stm.setObject(8, e1.getJoin_date());
        stm.setObject(9, e1.getEp_id());
        return stm.executeUpdate()>0;
    }
    
}
