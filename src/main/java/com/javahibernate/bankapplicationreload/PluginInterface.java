/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javahibernate.bankapplicationreload;

import Services.IService;
import Services.IService;
import java.util.List;
import org.pf4j.ExtensionPoint;

/**
 *
 * @author cghfcjg
 */
public interface PluginInterface extends IService, ExtensionPoint {
     String identify();
    List<?> reactiveRoutes();
    List<Object> mvcControllers();
}
