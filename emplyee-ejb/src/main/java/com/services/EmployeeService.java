/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.entities.Department;
import com.entities.Employee;
import com.entities.Gender;
import com.facades.DepartmentFacadeLocal;
import com.facades.EmployeeFacadeLocal;
import com.facades.GenderFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Abdallah Saboukh
 */
@Stateless
public class EmployeeService implements EmployeeServiceLocal {

    @EJB
    private GenderFacadeLocal genderFacadeLocal;

    @EJB
    private DepartmentFacadeLocal departmentFacadeLocal;

    @EJB
    private EmployeeFacadeLocal employeeFacadeLocal;

    @Override
    public List<Gender> findAllGenders() {
        return genderFacadeLocal.findAll();
    }

    @Override
    public List<Department> findAllDeparments() {
        return departmentFacadeLocal.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeFacadeLocal.create(employee);
    }

    @Override
    public void deleteEmployee(Employee selectedEmployee) {
        employeeFacadeLocal.remove(selectedEmployee);
    }

    @Override
    public List<Employee> searchEmployee(Employee employee) {
        return employeeFacadeLocal.searchEmployee(employee);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
