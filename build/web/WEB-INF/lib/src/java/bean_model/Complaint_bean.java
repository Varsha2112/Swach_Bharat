/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean_model;

/**
 *
 * @author Harshit
 */
public class Complaint_bean {
    
    private String username;
    
    private String fname;
    
    private String lname;
    
    private String phone;
    
    private String comp_type;
    
    private String description;
    
    private String comp_no;

    public Complaint_bean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComp_type() {
        return comp_type;
    }

    public void setComp_type(String comp_type) {
        this.comp_type = comp_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String getComp_no() {
        return comp_no;
    }

    public void setComp_no(String comp_no) {
        this.comp_no = comp_no;
    }
    
}
