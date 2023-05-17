package com.qf.day40.servlet;

import com.qf.day40.service.AccountService;
import com.qf.day40.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete.do")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String id = request.getParameter("id");
        int nid = 0;
        try {
            nid = Integer.parseInt(id);
        }catch (Exception e){}
        AccountService accountService = new AccountServiceImpl();
        accountService.delete(nid);
        response.sendRedirect("list.do");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
