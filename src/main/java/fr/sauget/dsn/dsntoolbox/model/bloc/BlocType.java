/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sauget.dsn.dsntoolbox.model.bloc;

/**
 *
 * @author marc
 */
public enum BlocType {
    
    DSN_MENSUEL("DSN_MENSUEL"),
    CONTACT_DECLARE("");
    
    
    
    BlocType(String val){value = val;};
    private final String value; 
    
    public String getValue(){return value;}

    
}
