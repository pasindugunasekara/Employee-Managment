
package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Loans;


public class TotalCurrentlyLoans {

    public List<Loans> getAllLoans() throws ClassNotFoundException, SQLException {
        
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set=connection.prepareStatement("SELECT * FROM loans").executeQuery(); 
        List<Loans> tempList=new ArrayList();
        while(set.next()){
            tempList.add(new Loans(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5)
                    
            ));
        }
        return tempList;
    }
}
    

