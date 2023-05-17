package com.qf.day41.service.impl;

import com.qf.day41.dao.DepartmentDAO;
import com.qf.day41.dao.impl.DepartmentDAOImpl;
import com.qf.day41.entity.Department;
import com.qf.day41.service.DepartmentService;
import com.qf.day41.utils.DBConnection;

import java.sql.SQLException;
import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDAO departmentDAO = new DepartmentDAOImpl();

    @Override
    public List<Department> findAll()  {
        try {
           return departmentDAO.findAll();
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
}
