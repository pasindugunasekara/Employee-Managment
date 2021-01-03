package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Employee;

public class TotalCurrentlyEmployeeController {

    public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.prepareStatement("SELECT * FROM employee").executeQuery();
    
        List<Employee> tempList= new ArrayList();
        while(set.next()){
            tempList.add(new Employee(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6),
                    set.getString(7),
                    set.getString(8),
                    set.getString(9)
            ));
        }
        
            return tempList;    }
    
}
