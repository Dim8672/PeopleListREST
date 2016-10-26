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
@Named(value = "personBean")
@RequestScoped
public class PersonBean extends Person {

    @Inject
    Services services;

    public PersonBean() {
        super();
    }

    public String addPerson() {
        services.savePerson(this.getGender(), this.getFirstName(), this.getLastName(), this.getMarried(), this.getBirthDate());
        return "index.xhtml";
    }

}
