/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mototaxi;

import coneccao.connect;

/**
 *
 * @author Amorim
 */
public class Mototaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect objectConnect = new connect();
        objectConnect.establishConnect();
        
    }
    
}
