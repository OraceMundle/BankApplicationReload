/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

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
@Table(name="customeraddress", schema ="bankapp")
public class CustomerAddress {
    
    @Id
    @Column(name="address_id")
    private int addressId;
    
    @Column(name="street")
    private String street;
    
    @Column(name="community")
    private String community;
    
    @Column(name="country")
    private String country;
    
    //@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
    @Column(name="customer_trn")
    private String customer;

   
    
   

    public CustomerAddress() {
    }
/*
    public CustomerAddress(CustomerAddress address ,Customer customer) {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }
*/
    public CustomerAddress(CustomerAddress address ,Customer customer) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      this.addressId= address.addressId;
      this.community=address.community;
      this.country=address.community;
      this.street=address.street;
      this.customer=customer.getTrn();
      
      
      
    }
    
    
    
    public CustomerAddress(int addressId, String street, String community, String country, Customer customer) {
        this.addressId = addressId;
        this.street = street;
        this.community = community;
        this.country = country;
        this.customer = customer.getTrn();
    }
    
    
    
    

    public int getAddressId() {
        return addressId;
    }

    public String getStreet() {
        return street;
    }

    public String getCommunity() {
        return community;
    }

    public String getCountry() {
        return country;
    }

     public String getCustomer() {
        return customer;
    }
    
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer.getTrn();
    }
    
    
    
}
