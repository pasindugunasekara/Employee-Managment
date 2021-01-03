package lk.ijse.SPRDA.model;

public class Loans {
        private String Loan_id;
	private String Ep_id;
	private String Loan_amount;
	private String Duration;
	private String Loan_type;
        
        public Loans(){
            
        }
        
        public Loans(String Loan_id,String Ep_id,String Loan_amount,String Duration,String Loan_type){
            this.Loan_id=Loan_id;
            this.Ep_id=Ep_id;
            this.Loan_amount=Loan_amount;
            this.Duration=Duration;
            this.Loan_type=Loan_type;
        }
        
    public String getLoan_id(){
            return Loan_id;
        }
    public String getEp_id(){
            return Ep_id;
        }
    public String getLoan_amount(){
            return Loan_amount;
        }
    public String getDuration(){
            return Duration;
        }
    public String getLoan_type(){
            return Loan_type;
        }
}
