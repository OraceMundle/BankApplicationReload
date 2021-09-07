/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author OraceMundle
 */
 @Entity
 @Table(name ="customer")
 
public class Customer implements Serializable{
    
    @Id
    @Column(name ="trn")
    private String trn;
    
    @Column(name ="f_name")
    private String firstname;
     
    @Column(name ="l_name")
    private String lastname;
      
    @Column(name ="dob")
    private String dob;
       
    @Column(name ="email")
    private String email;
        
    @Column(name ="telephone_number")
    private String telephoneNum;
         
    
    
   
    public Customer() {
    }

    public Customer(String trn, String firstname, String lastname, String dob, String email, String telephoneNum, String accountNumber) {
        this.trn = trn;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.email = email;
        this.telephoneNum = telephoneNum;
        
    }

    public String getTrn() {
        return trn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

  

    public void setTrn(String trn) {
        this.trn = trn;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

   
    
    
    
    
}
