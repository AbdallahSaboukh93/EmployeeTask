/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.entities.Department;
import com.entities.Employee;
import com.entities.Gender;
import com.services.EmployeeServiceLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Abdallah Saboukh
 */
@Named(value = "employeeBB")
@ViewScoped
public class EmployeeBB implements Serializable {

    @EJB
    private EmployeeServiceLocal employeeService;

    private Employee employee = new Employee();
    private Employee selectedEmployee = new Employee();
    private List<Employee> employeeList = new ArrayList<>();
    private List<Gender> genderList = new ArrayList<>();
    private List<Department> deparmentList = new ArrayList<>();
    private boolean addMode ; 

    @PostConstruct
    public void init() {
        genderList = employeeService.findAllGenders();
        deparmentList = employeeService.findAllDeparments();
    }

    public void add() {
        employeeService.saveEmployee(employee);
        employeeList.add(employee);
    }

    public void delete() {
        employeeService.deleteEmployee(selectedEmployee);
        employeeList.remove(selectedEmployee);
    }
    
    
    public void search() {
      employeeList =  employeeService.searchEmployee(employee);
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Gender> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<Gender> genderList) {
        this.genderList = genderList;
    }

    public List<Department> getDeparmentList() {
        return deparmentList;
    }

    public void setDeparmentList(List<Department> deparmentList) {
        this.deparmentList = deparmentList;
    }

    public boolean isAddMode() {
        return addMode;
    }

    public void setAddMode(boolean addMode) {
        this.addMode = addMode;
    }
    
    
    


}
