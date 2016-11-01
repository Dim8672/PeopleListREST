/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.beans;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author dimitri.mella
 */
@Named(value = "delPerson")
@RequestScoped
public class DelPersonBean  {
    private Person delPerson;
    @Inject
    Services services;

    /**
     * Creates a new instance of DelPerson
     */
    public DelPersonBean() {
        this.delPerson = null;
    }
    
    public deletePerson(Person)
    
    
    
}
