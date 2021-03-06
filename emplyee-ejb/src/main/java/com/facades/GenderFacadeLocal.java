/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facades;

import com.entities.Gender;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Abdallah Saboukh
 */
@Local
public interface GenderFacadeLocal {

    void create(Gender gender);

    void edit(Gender gender);

    void remove(Gender gender);

    Gender find(Object id);

    List<Gender> findAll();

    List<Gender> findRange(int[] range);

    int count();
    
}
