/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facades;

import com.entities.Gender;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Abdallah Saboukh
 */
@Stateless
public class GenderFacade extends AbstractFacade<Gender> implements GenderFacadeLocal {

    @PersistenceContext(unitName = "com_emplyee-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GenderFacade() {
        super(Gender.class);
    }
    
}
