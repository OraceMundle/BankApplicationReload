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
@Table(name="account")
public class Account {
    
    @Id
    @Column(name = "account_number")
    private String accountnumber;
    
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
    private String customerTRN;
    
    @Column(name = "worker_id")
    private String workerId;

    public Account() {
    }

    public Account(String accountnumber, float balance, float loanAmount, float monthlyInstalment, String dateOpened, String dateClosed, String customerTRN, String workerId) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.loanAmount = loanAmount;
        this.monthlyInstalment = monthlyInstalment;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;
        this.customerTRN = customerTRN;
        this.workerId = workerId;
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getAccountnumber() {
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

    public String getCustomerTRN() {
        return customerTRN;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setWorkerId(String workerId) {
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

    public void setCustomerTRN(String customerTRN) {
        this.customerTRN = customerTRN;
    }
    
    
    
    
}
