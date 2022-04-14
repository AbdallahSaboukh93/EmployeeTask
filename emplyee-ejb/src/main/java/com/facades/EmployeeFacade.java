/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facades;

import com.entities.Department_;
import com.entities.Employee;
import com.entities.Employee_;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Abdallah Saboukh
 */
@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> implements EmployeeFacadeLocal {

    @PersistenceContext(unitName = "com_emplyee-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    CriteriaBuilder cb;

    @PostConstruct
    protected void initCriteriaBuilder() {
        cb = getEntityManager().getCriteriaBuilder();
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeFacade() {
        super(Employee.class);
    }

    @Override
    public List<Employee> searchEmployee(Employee employee) {
        
          CriteriaQuery criteriaQuery = cb.createQuery();
        Root<Employee> employeeRoot = criteriaQuery.from(Employee.class);
        criteriaQuery.select(employeeRoot);
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(employeeRoot.get(Employee_.departmentId), employee.getDepartmentId()));
       // predicates.add(cb.equal(employeeRoot.get(Employee_.genderId), employee.getGenderId()));
        criteriaQuery.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
        TypedQuery typedQuery = em.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

}
