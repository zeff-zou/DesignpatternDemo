package com.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzf on 2018/4/18.
 */
public class MediatorImpl extends Mediator {

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employee.setMediator(this);
        this.employeeList.add(employee);
    }

    public void mediatorOperation(Employee employee){
        for (Employee em : employeeList){
            if (!employee.equals(em)){
                em.out();
            }
        }
    }
}
