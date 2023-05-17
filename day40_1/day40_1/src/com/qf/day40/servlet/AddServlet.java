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

@WebServlet("/add.do")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        final String email = request.getParameter("email");
        final String pwd = request.getParameter("pwd");
        final String truename = request.getParameter("truename");
        final String qq = request.getParameter("qq");
        final String wx = request.getParameter("wx");
        final String phone = request.getParameter("phone");

        Account account = Account.builder()
                .email(email)
                .truename(truename)
                .qq(qq)
                .wx(wx)
                .phone(phone)
                .pwd(pwd)
                .build();
        AccountService accountService = new AccountServiceImpl();
        accountService.save(account);

        response.sendRedirect("list.do");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
