/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

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
@Table(name="account")

public class Account implements Serializable {
    
    @Id
    @Column(name = "account_number")
    private int accountnumber;
    
    @Column(name = "balance")
    private float balance; 
    
    @Column(name = "loan_amount")
    private float loanAmount;
    
    @Column(name = "monthly_install")
    private float monthlyInstalment;
    
    @Column(name = "date_opened")
    private String dateOpened;
    
    @Column(name = "date_closed")
    private String dateClosed;
    
    @Column(name = "trn")
    private int customerTRN;
    
    @Column(name = "worker_id")
    private int workerId;
    
    
     //@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	//@JoinColumn(name="trn")
	private Customer  customer;
     
     
      //@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	//@JoinColumn(name="worker_id")
	private Worker  worker;
     
    public Account() {
    }

    public Account(Account account, Customer customer, Worker worker )
    {
        this.accountnumber=account.accountnumber;
        this.balance=account.balance;
        this.loanAmount=account.loanAmount;
        this.dateClosed=account.dateOpened;
        this.dateClosed=account.dateClosed;
        this.monthlyInstalment=account.monthlyInstalment;
        this.customerTRN=Integer.parseInt(customer.getTrn());
        this.workerId=worker.getId();
      
               
    
    }
    
    
    
    
    
    
    
    public Account(int accountnumber, float balance, float loanAmount, float monthlyInstalment, String dateOpened, String dateClosed, int customerTRN, int workerId) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.loanAmount = loanAmount;
        this.monthlyInstalment = monthlyInstalment;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;
        this.customerTRN = customerTRN;
        this.workerId = workerId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public float getBalance() {
        return balance;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public float getMonthlyInstalment() {
        return monthlyInstalment;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public int getCustomerTRN() {
        return customerTRN;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Worker getWorker() {
        return worker;
    }
    
    
    
    

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setMonthlyInstalment(float monthlyInstalment) {
        this.monthlyInstalment = monthlyInstalment;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    public void setCustomerTRN(int customerTRN) {
        this.customerTRN = customerTRN;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Account(Customer customer, Worker worker) {
        this.customer = customer;
        this.worker = worker;
    }
    
    
    
    
    
    
}
