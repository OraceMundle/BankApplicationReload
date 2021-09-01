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
@Table(name ="workerlog")
public class WorkerLog {
    
    @Id
    @Column(name="workerlog_id")
    private int id;
    
    @Column(name="worker_id")
    private String workerId;
    
    @Column(name="message")
    private String message;
    
    @Column(name="date")
    private String date;

    public WorkerLog() {
    }

    public WorkerLog(int id, String workerId, String message, String date) {
        this.id = id;
        this.workerId = workerId;
        this.message = message;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }
    
    
    
}
