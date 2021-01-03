package lk.ijse.SPRDA.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.SPRDA.db.DBConnection;
import lk.ijse.SPRDA.model.Loans;

 public class LoansController {

    public boolean saveLoans(Loans l1) throws ClassNotFoundException, SQLException {
      
        Connection con=DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO Loans VALUES(?,?,?,?,?)");
           stm.setString(1, l1.getLoan_id());
           stm.setString(2, l1.getEp_id());
           stm.setString(3, l1.getLoan_amount());
           stm.setString(4, l1.getDuration());
           stm.setString(5, l1.getLoan_type());
           
           return stm.executeUpdate()>0;
    }

    public Loans getLoans(String requestLoan_id) throws ClassNotFoundException, SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set  =connection.prepareStatement("SELECT * FROM Loans WHERE Loan_id=+'"+requestLoan_id+"'").executeQuery(); 
        
        if(set.next()){
            return new Loans(
                    set.getString("Loan_id"),
                    set.getString("Ep_id"),
                    set.getString("Loan_amount"),
                    set.getString("Duration"),
                    set.getString("Loan_type")
            );
        }
            return null;
    }

    public boolean dropLoans(String requestLoan_id) throws SQLException, ClassNotFoundException {
        
        Connection connection = DBConnection.getInstance().getConnection();
        return connection.prepareStatement("DELETE FROM loans WHERE Loan_id='"+requestLoan_id+"'").executeUpdate()>0;
    }

    public boolean updateState(Loans l1) throws ClassNotFoundException,SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE loans SET Ep_id=?,Loan_amount=?,Duration=?,Loan_type=? WHERE Loan_id=?");
    
        stm.setObject(1, l1.getEp_id());
        stm.setObject(2, l1.getLoan_amount());
        stm.setObject(3, l1.getDuration());
        stm.setObject(4, l1.getLoan_type());
        stm.setObject(5, l1.getLoan_id());
        
        return stm.executeUpdate()>0;
    }
    
}
