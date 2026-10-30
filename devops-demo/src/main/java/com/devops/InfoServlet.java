
package com.devops;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {

    private final AppInfo appInfo = new AppInfo();

    @Override
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>DevOps Infrastructure Portal</title>");
        out.println("</head>");

        out.println("<body style='font-family:Arial;padding:30px'>");

        out.println("<h1>DevOps Infrastructure Portal</h1>");

        out.println("<h3>Application Details</h3>");

        out.println("<p>Application: "
            + appInfo.getApplicationName() + "</p>");

        out.println("<p>Version: "
            + appInfo.getVersion() + "</p>");

        out.println("<p>Environment: "
            + appInfo.getEnvironment() + "</p>");

        out.println("<p>Server Hostname: "
            + appInfo.getServerName() + "</p>");

        out.println("<p>Java Version: "
            + appInfo.getJavaVersion() + "</p>");

        out.println("<p>Operating System: "
            + appInfo.getOperatingSystem() + "</p>");

        out.println("<h2 style='color:green'>Status: "
            + appInfo.getStatus() + "</h2>");

        out.println("</body>");
        out.println("</html>");
    }
}
