/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Lenovo
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public float add(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
       float result = a+b;
       return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mod")
    public float mod(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        float result = a/b;
        
        return result;
    }
}
