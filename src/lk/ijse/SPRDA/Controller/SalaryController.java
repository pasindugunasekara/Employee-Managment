/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Salary;

/**
 *
 * @author HP
 */
public class SalaryController {

    public boolean saveSalary(Salary s1) throws ClassNotFoundException, SQLException {
        
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO salary VALUES(?,?,?,?,?)");
        stm.setString(1, s1.getEp_id());
        stm.setString(2, s1.getDesignation());
        stm.setString(3, s1.getLoan_id());
        stm.setString(4, s1.getBsalary());
        stm.setString(5, s1.getTotal_salary());
        
        return stm.executeUpdate()>0;
    }
    
}
