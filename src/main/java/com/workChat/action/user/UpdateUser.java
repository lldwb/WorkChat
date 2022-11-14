package com.workChat.action.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workChat.service.WorkChat;
import com.workChat.service.WorkChatImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String id = req.getParameter("id");
        String name = req.getParameter("naem");
        String pwd = req.getParameter("pwd");

        WorkChat workChat = new WorkChatImpl();
        ObjectMapper om = new ObjectMapper();

        String json =om.writeValueAsString(workChat.updateUser(Integer.parseInt(id),name,pwd));
        resp.getWriter().print(json);
    }
}
