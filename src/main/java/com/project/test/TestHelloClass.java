/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.test;

import com.project.model.HelloClass;

/**
 *
 * @author KUROMMNK
 */
public class TestHelloClass {
    
    public static void main(String args[]){
        HelloClass helloTest = new HelloClass(1);
        
        System.out.println(helloTest.pullMessage(1));
        
    }
    
}
