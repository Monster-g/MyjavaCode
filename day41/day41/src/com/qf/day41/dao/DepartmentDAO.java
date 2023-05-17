package com.qf.day41.dao;

import com.qf.day41.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface DepartmentDAO {
    List<Department> findAll() throws SQLException;
}
