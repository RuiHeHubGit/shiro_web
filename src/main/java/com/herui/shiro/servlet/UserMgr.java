package com.herui.shiro.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userMgr")
public class UserMgr extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(UserMgr.class);

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("userMgr servlet");
        req.getRequestDispatcher("/WEB-INF/jsp/userMgr.jsp").forward(req, resp);
    }
}