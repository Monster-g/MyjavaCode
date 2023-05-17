package com.qf.day41.service;

import com.qf.day41.entity.Employee;
import com.qf.day41.entity.PageBean;

public interface EmployeeService {
    PageBean findAll(Integer page);
    int save(Employee employee);
}
