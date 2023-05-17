package com.qf.day41.dao.impl;

import com.qf.day41.dao.EmployeeDAO;
import com.qf.day41.entity.Employee;
import com.qf.day41.utils.DBConnection;
import com.qf.day41.utils.SQLConstants;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private QueryRunner runner = new QueryRunner();

    @Override
    public List<Employee> findAll(Integer skip, Integer size) throws SQLException {
        return runner.query(DBConnection.getConnection(), SQLConstants.EMPLOYEE_FIND_ALL,
                new BeanListHandler<>(Employee.class), skip, size);
    }

    @Override
    public Long findCount() throws SQLException {
        return runner.query(DBConnection.getConnection(), SQLConstants.EMPLOYEE_FIND_COUNT,
                new ScalarHandler<>());
    }

    @Override
    public int save(Employee employee) throws SQLException {
        return runner.update(DBConnection.getConnection(), SQLConstants.EMPLOYEE_SAVE,
                employee.getName(), employee.getSex(), employee.getAge(),
                employee.getSalary(), employee.getPhoto(), employee.getDeptId(),
                employee.getHobby(), employee.getCreatetime(), employee.getUpdatetime(),
                employee.getPhotoname());
    }
}
