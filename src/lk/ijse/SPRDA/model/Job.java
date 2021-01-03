package lk.ijse.SPRDA.model;

public class Job {
    private String Ep_id;
    private String Designation;
    private String District_Office;
    private String Divisional_Office;
    
    public Job(){
        
    }
    
    public Job(String Ep_id,String Designation,String District_Office,String Divisional_Office){
        this.Ep_id=Ep_id;
        this.Designation=Designation;
        this.District_Office=District_Office;
        this.Divisional_Office=Divisional_Office;
    }
    public String getEp_id(){
        return Ep_id;
    }
    public String getDesignation(){
        return Designation;
    }
    public String getDistrict_Office(){
        return District_Office;
    }
    public String getDivisional_Office(){
        return Divisional_Office;
    }
    
}
