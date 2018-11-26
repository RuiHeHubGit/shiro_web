package com.herui.shiro.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authMgr")
public class AuthMgr extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(AuthMgr.class);

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("authMgr servlet");
        req.getRequestDispatcher("/WEB-INF/jsp/authMgr.jsp").forward(req, resp);
    }
}
