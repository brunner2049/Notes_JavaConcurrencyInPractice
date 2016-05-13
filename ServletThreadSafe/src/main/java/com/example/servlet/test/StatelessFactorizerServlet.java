package com.example.servlet.test;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by bleach on 2016/5/12.
 */
public class StatelessFactorizerServlet implements Servlet{

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("Servlet execute.");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
