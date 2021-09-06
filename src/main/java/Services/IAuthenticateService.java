/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Domain.Customer;
import Domain.Worker;
import org.springframework.stereotype.Component;


/**
 *
 * @author OraceMundle
 */
public interface IAuthenticateService extends IService{
    
    public final String  NAME = "IAuthenticateService";
    
    public Boolean validateUser(String username) throws Exception;
    public Boolean validateUsernameAndPwd(Customer user) throws Exception;
    public Boolean addUser(Customer user) throws Exception;
    public Boolean updateUser(Customer user) throws Exception;
    
    
    public Boolean validateWorker(String username) throws Exception;
    public Boolean validateWorkerUsernameAndPwd(Customer user) throws Exception;
    public Boolean addWorker(Customer user) throws Exception;
    public Boolean updateWorker(Customer user) throws Exception;
    
    
    
}
