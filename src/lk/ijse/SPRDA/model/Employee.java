package lk.ijse.SPRDA.model;

public class Employee{
    
        String Ep_id;
	String Name;
	String Address;
	String Contact;
	String Birthday;
	String State;
	String City;
	String Email;
	String Join_date;
    
        
        public Employee(){    
        }

        public Employee(String Ep_id,String Name,String Address,String Contact,String Birthday,String State,String City,String Email,String Join_date){
            this.Ep_id=Ep_id;
            this.Name=Name;
            this.Address=Address;
            this.Contact=Contact;
            this.Birthday=Birthday;
            this.State=State;
            this.City=City;
            this.Email=Email;
            this.Join_date=Join_date;
        }

    public String getEp_id() {
        return Ep_id;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getContact() {
        return Contact;
    }
    
    public String getBirthday() {
        return Birthday;
    }

    public String getState() {
        return State;
    }

    public String getCity() {
        return City;
    }

    public String getEmail() {
        return Email;
    }

    public String getJoin_date() {
        return Join_date;
    }
        
} 
 