package com.qf.day41.utils;

public interface SQLConstants {
    String EMPLOYEE_SAVE = "INSERT INTO employee(`name`, sex, age, salary, photo, dept_id, hobby, createtime, updatetime, photoname) VALUES(?,?,?,?,?,?,?,?,?,?)";
    String EMPLOYEE_FIND_ALL = "SELECT e.id, e.`name`, e.sex, e.age, e.salary, e.photo, e.dept_id deptId, e.hobby, e.createtime, e.updatetime, e.photoname, d.`name` AS deptName FROM employee AS e left JOIN department AS d ON e.dept_id = d.id limit ?,?";
    String EMPLOYEE_FIND_COUNT = "SELECT COUNT(1) FROM employee";
    String EMPLOYEE_FIND_BY_ID = "SELECT e.id, e.`name`, e.sex, e.age, e.salary, e.photo, e.dept_id, e.hobby, e.createtime, e.updatetime, e.photoname FROM employee AS e WHERE e.id = ?";
    String EMPLOYEE_UPDATE = "UPDATE employee SET `name`=?, sex=?, age=?, salary=?, photo=?, dept_id=?, hobby=?, createtime=?, updatetime=?, photoname=? WHERE id = ?";
    String EMPLOYEE_DELETE = "DELETE FROM employee WHERE id = ?";

    String DEPARTMENT_SAVE = "";
    String DEPARTMENT_FIND_ALL = "SELECT id, `name` FROM department";
    String DEPARTMENT_FIND_BY_ID = "";
    String DEPARTMENT_UPDATE = "";
    String DEPARTMENT_DELETE = "";
}
