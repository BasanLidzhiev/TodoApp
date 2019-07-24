package ru.lidzhiev.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //HttpSession session = req.getSession();
        req.setAttribute("name", "Tom");
        req.setAttribute("age", 34);
        getServletContext().getRequestDispatcher("/test.jsp").forward(req,resp);
    }
}
