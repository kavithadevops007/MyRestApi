package com.kavitech.rest.dao;

import com.kavitech.rest.model.Employee;
import com.kavitech.rest.model.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

    private static Employees list = new Employees();

    static {
        list.getEmployeeList().add(new Employee(1,"Kavitha", "Ramkumar", "kavitha.ramkumar@gmail.com"));
        list.getEmployeeList().add(new Employee(2,"Ramkumar", "Krishnan", "ramkumaryadav@gmail.com"));
        list.getEmployeeList().add(new Employee(3,"Nithil", "Ramkumar", "Nithil.ramkumar@gmail.com"));
        list.getEmployeeList().add(new Employee(4,"Visakan", "Ramkumar", "Visakan.ramkumar@gmail.com"));
    }

    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }

    public static void main(String[] args) {
        EmployeeDAO dao1 = new EmployeeDAO();
        EmployeeDAO dao2 = new EmployeeDAO();
        System.out.println(dao1.getAllEmployees().toString());
        System.out.println(dao2.getAllEmployees().toString());
    }
}
