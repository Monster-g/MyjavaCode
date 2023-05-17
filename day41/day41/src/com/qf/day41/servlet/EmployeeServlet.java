package com.qf.day41.servlet;

import com.qf.day41.entity.Department;
import com.qf.day41.entity.Employee;
import com.qf.day41.entity.PageBean;
import com.qf.day41.service.DepartmentService;
import com.qf.day41.service.EmployeeService;
import com.qf.day41.service.impl.DepartmentServiceImpl;
import com.qf.day41.service.impl.EmployeeServiceImpl;
import com.qf.day41.utils.CommonConstants;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

// 配置文件上传（必须是Servlet3.0以上的版本）
@MultipartConfig
@WebServlet("/employee.do")
public class EmployeeServlet extends BaseServlet{
    private EmployeeService employeeService = new EmployeeServiceImpl();
    private DepartmentService departmentService = new DepartmentServiceImpl();

    protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String page = request.getParameter("page");
        int nPage = 1;
        try {
            nPage = Integer.parseInt(page);
        }catch (Exception e){}
        PageBean bean = employeeService.findAll(nPage);
        request.setAttribute("bean", bean);
        request.getRequestDispatcher("employee/list.jsp").forward(request, response);
    }

    protected void preAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final List<Department> list = departmentService.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("employee/add.jsp").forward(request, response);
    }

    protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String name = request.getParameter("name");
        final String sex = request.getParameter("sex");
        int nSex = 1;
        try {
            nSex = Integer.parseInt(sex);
        }catch (Exception e){

        }
        final String salary = request.getParameter("salary");
        int nSalary = 0;
        try {
            nSalary = Integer.parseInt(salary);
        }catch (Exception e){

        }
        final String age = request.getParameter("age");
        int nAge = 0;
        try {
            nAge = Integer.parseInt(age);
        }catch (Exception e){

        }
        final String deptId = request.getParameter("deptId");
        int nDeptId = 1;
        try {
            nDeptId = Integer.parseInt(deptId);
        }catch (Exception e){

        }
        final String [] hobbies = request.getParameterValues("hobby");
        String hobby = "";
        if (hobbies != null){
            hobby = String.join(",", hobbies);
        }
        final Employee employee = Employee.builder()
                .name(name)
                .sex(nSex)
                .salary(nSalary)
                .age(nAge)
                .deptId(nDeptId)
                .hobby(hobby)
                .build();
        // 接收文件
        final Part part = request.getPart("photo");
        if (part.getSize() > 0){
            // 生成一个随机的名字
            String fileName = UUID.randomUUID().toString().replace("-", "");
            // 保存到本地路径
            part.write(CommonConstants.BASE_PATH + fileName);
            employee.setPhoto(fileName);
            employee.setPhotoname(part.getSubmittedFileName());
        }
        employeeService.save(employee);
        response.sendRedirect("employee.do");
    }
}
