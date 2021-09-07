/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Domain.Customer;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author OraceMundle
 */

@Entity
@Table(name = "worker")
//public class Worker extends Customer{
    public class Worker implements Serializable{
    
    @Id
    @Column(name="worker_id")
    private String id;
    
    @Column(name="f_name")
    private String firstname;
    
    @Column(name="l_name")
    private String lastname;
    

    @Column(name="telephone")
    private String telephoneNumber;
    
    
    
    @Column(name="email")
    private String email;
    
    
    @Column(name = "account_number")
    private int accountNumber;
    
    
    //@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
    //@JoinColumn(name="account_number")
	private Account  account;

    public Worker() {
    }
/*
    public Worker(String id, String firstname, String lastname, String telephoneNumber, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        //this.setFirstname(firstname);
        //this.setLastname(lastname);
        this.setTelephoneNumber(telephoneNumber);
        this.email = email;
    }
*/
    
    
    
    
    public Worker(String id, String firstname, String lastname, String telephoneNumber, String email, int accountNumber, Account account) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.accountNumber = accountNumber;
        this.account = account;
    }
    
    

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
