package com.entities;

import com.entities.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="٢٠٢٢-٠٤-١٥T٠٠:٠٤:٢٢")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile ListAttribute<Department, Employee> employeeList;
    public static volatile SingularAttribute<Department, String> name;
    public static volatile SingularAttribute<Department, Integer> id;

}