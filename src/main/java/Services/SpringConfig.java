/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author OraceMundle
 */

@Configuration
@ComponentScan({"CrudManager","Domain","Services","Services.HibernateImplement","Services.JDBCImpl","Presentation"})
public class SpringConfig {
    
}
