package com.entities;

import com.entities.Department;
import com.entities.Gender;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="٢٠٢٢-٠٤-١٥T٠٠:٠٤:٢٢")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> phone;
    public static volatile SingularAttribute<Employee, Department> departmentId;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SingularAttribute<Employee, Gender> genderId;
    public static volatile SingularAttribute<Employee, Integer> id;
    public static volatile SingularAttribute<Employee, String> email;

}