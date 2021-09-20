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
 @Table(name ="transaction")

public class TransactionCal implements Serializable {
 
@Id
@Column(name ="transaction_id")    
private int transactionid;  

@Column(name ="worker_id") 
private String worker_id;

@Column(name ="account_number") 
private int account_number;

@Column(name ="current_balance") 
private float current_balance;

@Column(name ="payment_amount") 
private float  payment_amount;
  

@Column(name ="previous_balance") 
private float previous_balance;

@Column(name ="transaction_date") 
private String transaction_date;


private Account account;

private Worker worker;

    
 public TransactionCal() {
    }

    public TransactionCal(int transactionid, String worker_id, int account_number, float current_balance, float payment_amount, float previous_balance, String transaction_date, Account account, Worker worker) {
        this.transactionid = transactionid;
        this.worker_id = worker_id;
        this.account_number = account_number;
        this.current_balance = current_balance;
        this.payment_amount = payment_amount;
        this.previous_balance = previous_balance;
        this.transaction_date = transaction_date;
        this.account = account;
        this.worker = worker;
    }

    public int getTransactionid() {
        return transactionid;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public int getAccount_number() {
        return account_number;
    }

    public float getCurrent_balance() {
        return current_balance;
    }

    public float getPayment_amount() {
        return payment_amount;
    }

    public float getPrevious_balance() {
        return previous_balance;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public Account getAccount() {
        return account;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setCurrent_balance(float current_balance) {
        this.current_balance = current_balance;
    }

    public void setPayment_amount(float payment_amount) {
        this.payment_amount = payment_amount;
    }

    public void setPrevious_balance(float previous_balance) {
        this.previous_balance = previous_balance;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
 
 
    public void CalculateBalance(float payment_amount){
    
   float newBalance = previous_balance - payment_amount; 
        current_balance=newBalance;
            
        
    }
    
    
    
}
