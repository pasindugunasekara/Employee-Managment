
package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Salary;

public class TotalCurrentlySalary {

    public List<Salary> getAllSalary() throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection(); 
        ResultSet set=connection.prepareStatement("SELECT * FROM Salary").executeQuery(); 
        
        
        
         List<Salary> tempList= new ArrayList();
        while(set.next()){
            tempList.add(new Salary(
                   
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5)
                            
                            
            ));
        }
        
        return tempList;    }
        
    }
    
