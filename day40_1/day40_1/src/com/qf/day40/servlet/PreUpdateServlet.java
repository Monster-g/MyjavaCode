package com.qf.day40.servlet;

import com.qf.day40.entity.Account;
import com.qf.day40.service.AccountService;
import com.qf.day40.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/preUpdate.do")
public class PreUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String id = request.getParameter("id");
        int nid = 0;
        try {
            nid = Integer.parseInt(id);
        }catch (Exception e){}
        AccountService accountService = new AccountServiceImpl();
        final Account account = accountService.findById(nid);
        request.setAttribute("account", account);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
