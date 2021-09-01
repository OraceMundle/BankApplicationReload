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

/**
 *
 * @author OraceMundle
 */

@Entity
@Table(name="customeraddress")
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

    public CustomerAddress() {
    }

    public CustomerAddress(int addressId, String street, String community, String country) {
        this.addressId = addressId;
        this.street = street;
        this.community = community;
        this.country = country;
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
    
    
}
