package com.educacionit.web.server;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HellowWorldHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType ("text/html;charset=UTF-8");


        PrintWriter out = resp.getWriter ();

        out.println ("<h2>Hello World</h2>");
        out.println ("<h3>HttpServlet</h3>");
        out.println ("<h4>GET</h4>");

        out.close();
    }
}
