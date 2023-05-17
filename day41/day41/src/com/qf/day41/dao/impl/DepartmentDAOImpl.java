package com.qf.day41.dao.impl;

import com.qf.day41.dao.DepartmentDAO;
import com.qf.day41.entity.Department;
import com.qf.day41.utils.DBConnection;
import com.qf.day41.utils.SQLConstants;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {
    private QueryRunner runner = new QueryRunner();
    @Override
    public List<Department> findAll() throws SQLException {
        return runner.query(DBConnection.getConnection(), SQLConstants.DEPARTMENT_FIND_ALL, new BeanListHandler<>(Department.class));
    }
}
