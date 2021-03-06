package com.herui.shiro.servlet;

import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/noAuth")
public class NoAuth extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("url", WebUtils.getSavedRequest(req).getRequestUrl());
        req.getRequestDispatcher("/WEB-INF/jsp/noAuth.jsp").forward(req, resp);
    }
}

