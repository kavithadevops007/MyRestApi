package com.kavitech.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        if(employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        employeeList.stream().forEach(employee -> stringBuilder.append(employee.toString())
                .append(",")) ;
        return stringBuilder.toString();
    }
}
