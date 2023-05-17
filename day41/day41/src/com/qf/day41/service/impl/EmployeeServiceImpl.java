package com.qf.day41.service.impl;

import com.qf.day41.dao.EmployeeDAO;
import com.qf.day41.dao.impl.EmployeeDAOImpl;
import com.qf.day41.entity.Employee;
import com.qf.day41.entity.PageBean;
import com.qf.day41.service.EmployeeService;
import com.qf.day41.utils.DBConnection;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    @Override
    public PageBean findAll(Integer page) {
        try {
            final long count = employeeDAO.findCount();
            int skip = (page - 1) * PageBean.PAGE_SIZE;
            if(skip >= count){
                return null;
            }
            final List<Employee> list = employeeDAO.findAll(skip, PageBean.PAGE_SIZE);
            return new PageBean(count, page, list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                DBConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int save(Employee employee) {
        try {
            employee.setCreatetime(new Date());
            employee.setUpdatetime(new Date());
           return employeeDAO.save(employee);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                DBConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
