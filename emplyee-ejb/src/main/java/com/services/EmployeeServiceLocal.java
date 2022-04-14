/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.entities.Department;
import com.entities.Employee;
import com.entities.Gender;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Abdallah Saboukh
 */
@Local
public interface EmployeeServiceLocal {

    public List<Gender> findAllGenders();

    public List<Department> findAllDeparments();

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Employee selectedEmployee);

    public List<Employee> searchEmployee(Employee employee);

}
