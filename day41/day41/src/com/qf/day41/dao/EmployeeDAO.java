package com.qf.day41.dao;

import com.qf.day41.entity.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll(Integer skip, Integer size) throws SQLException;
    Long findCount() throws SQLException;
    int save(Employee employee) throws SQLException;
}
