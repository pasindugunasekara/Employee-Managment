
package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Job;

public class TotalCurrentlyJob {

   public List<Job> getAllJobs() throws ClassNotFoundException, SQLException {
       Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.prepareStatement("SELECT * FROM job").executeQuery(); 
        
        
         List<Job> tempList= new ArrayList();
        while(set.next()){
            tempList.add(new Job(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4)
                   
            ));
        }
        
        return tempList;    
   }
    
}
