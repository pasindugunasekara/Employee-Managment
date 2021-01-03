
package lk.ijse.SPRDA.model;


public class Salary {
    
    String Ep_id;
    String Designation;
    String Loan_id;
    String Bsalary;
    String Total_salary;

    public Salary(){    
    }

    public Salary(String Ep_id,String Designation,String Loan_id,String Bsalary,String Total_salary){
        this.Ep_id=Ep_id;
        this.Designation=Designation;
        this.Loan_id=Loan_id;
        this.Bsalary=Bsalary;
        this.Total_salary=Total_salary;
        
    }
    public String getEp_id() {
        return Ep_id;
    }
    public String getDesignation() {
        return Designation;
    }
    public String getLoan_id() {
        return Loan_id;
    }
    public String getBsalary() {
        return Bsalary;
    }
    public String getTotal_salary() {
        return Total_salary;
    }
    

}
